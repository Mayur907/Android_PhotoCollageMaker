package com.greendream.photocollagemaker.photobooklist;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;

import android.view.View;
import android.widget.FrameLayout;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.greendream.photocollagemaker.Glob;
import com.greendream.photocollagemaker.R;
import com.greendream.photocollagemaker.activities.CreatePhotoBookActivity;
import com.greendream.photocollagemaker.photogrid.DraggableGridExampleActivity;

import java.util.ArrayList;
import java.util.List;

public class PhotoBookListActivity extends AppCompatActivity implements RecyclerItemTouchHelper.RecyclerItemTouchHelperListener {

    private static final String TAG = PhotoBookListActivity.class.getSimpleName();

    private SwipeRefreshLayout swipeContainer;

    private RecyclerView recyclerView;
    private List<PhotoBook> cartList;
    private CartListAdapter mAdapter;

    private FrameLayout containView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photobook_list);

        containView = findViewById(R.id.container);

        swipeContainer = (SwipeRefreshLayout) findViewById(R.id.swipeContainer);
        swipeContainer.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                // Your code to refresh the list here.
                // Make sure you call swipeContainer.setRefreshing(false)
                // once the network request has completed successfully.
                prepareCart(new CallBackListener() {
                    @Override
                    public void onCallbackDone() {
                        swipeContainer.setRefreshing(false);
                    }
                });
            }
        });
        // Configure the refreshing colors
        swipeContainer.setColorSchemeResources(android.R.color.holo_blue_bright,
                android.R.color.holo_green_light,
                android.R.color.holo_orange_light,
                android.R.color.holo_red_light);

        recyclerView = findViewById(R.id.recycler_view);

        cartList = new ArrayList<>();
        mAdapter = new CartListAdapter(this, cartList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(mAdapter);

        // adding item touch helper
        // only ItemTouchHelper.LEFT added to detect Right to Left swipe
        // if you want both Right -> Left and Left -> Right
        // add pass ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT as param
        ItemTouchHelper.SimpleCallback itemTouchHelperCallback = new RecyclerItemTouchHelper(0, ItemTouchHelper.LEFT, this);
        new ItemTouchHelper(itemTouchHelperCallback).attachToRecyclerView(recyclerView);


        // making http call and fetching menu json
        prepareCart(null);

        ItemTouchHelper.SimpleCallback itemTouchHelperCallback1 = new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT | ItemTouchHelper.UP) {
            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
                // Row is swiped from recycler view
                // remove it from adapter
            }

            @Override
            public void onChildDraw(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
                super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
            }
        };

        // attaching the touch helper to recycler view
        new ItemTouchHelper(itemTouchHelperCallback1).attachToRecyclerView(recyclerView);


        // add button
        FloatingActionButton btnAdd = findViewById(R.id.btn_add);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(PhotoBookListActivity.this, CreatePhotoBookActivity.class));
            }
        });

        mAdapter.setMyViewHolderClickListener(new CartListAdapter.MyViewHolderClickListener() {
            @Override
            public void onItemViewClick(int position) {
                PhotoBook item = cartList.get(position);

                Intent intent = new Intent(PhotoBookListActivity.this, DraggableGridExampleActivity.class);
                intent.putExtra("id", item.getId());
                startActivity(intent);
            }
        });
    }

    /**
     * method make volley network call and parses json
     */
    private void prepareCart(final CallBackListener listener) {

        DatabaseReference databaseCart = FirebaseDatabase.getInstance().getReference(Glob.DATABASE_CART);

        databaseCart.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {


                // adding items to cart list
                cartList.clear();

                for (DataSnapshot property :dataSnapshot.getChildren()) {


                    PhotoBook item = property.getValue(PhotoBook.class);

                    cartList.add(item);
                }

                // refreshing recycler view
                mAdapter.notifyDataSetChanged();

                if (listener != null) {
                    listener.onCallbackDone();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });



    }

    /**
     * callback when recycler view is swiped
     * item will be removed on swiped
     * undo option will be provided in snackbar to restore the item
     */
    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction, int position) {
        if (viewHolder instanceof CartListAdapter.MyViewHolder) {
            // get the removed item format to display it in snack bar
            String name = cartList.get(viewHolder.getAdapterPosition()).getFormat();

            // backup of removed item for undo purpose
            final PhotoBook deletedItem = cartList.get(viewHolder.getAdapterPosition());
            final int deletedIndex = viewHolder.getAdapterPosition();

            // remove the item from recycler view
            mAdapter.removeItem(viewHolder.getAdapterPosition());


            DatabaseReference databaseCart = FirebaseDatabase.getInstance().getReference(Glob.DATABASE_CART).child(deletedItem.getId());
            databaseCart.removeValue();


            // showing snack bar with Undo option
            Snackbar snackbar = Snackbar.make(containView, name + " removed from cart!", Snackbar.LENGTH_LONG);
            snackbar.setAction("UNDO", new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    // undo is selected, restore the deleted item

                    mAdapter.restoreItem(deletedItem, deletedIndex);

                    DatabaseReference databaseCart = FirebaseDatabase.getInstance().getReference(Glob.DATABASE_CART).child(deletedItem.getId());
                    databaseCart.setValue(deletedItem);


                }
            });
            snackbar.setActionTextColor(Color.YELLOW);
            snackbar.show();
        }
    }


    CallBackListener callBackListener;
    public static interface CallBackListener{
        void onCallbackDone();
    }

    public void setCallBackListner(CallBackListener listener){
        this.callBackListener = listener;
    }
}
