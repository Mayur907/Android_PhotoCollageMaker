package com.abcd.photocollagemaker.pointlist;

import android.graphics.PointF;

import java.util.ArrayList;

public class Collage9 extends Collage {
    public static int shapeCount = 9;

    public Collage9(int i, int j) {
        this.collageLayoutList = new ArrayList();
        PointF[] apointf = new PointF[4];
        ArrayList obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, 0.25f * ((float) j)), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(0.25f * ((float) i), ((float) j) * 0.0f), new PointF(0.25f * ((float) i), 0.25f * ((float) j))});
        obj.add(new PointF[]{new PointF(0.25f * ((float) i), 0.25f * ((float) j)), new PointF(0.75f * ((float) i), 0.25f * ((float) j)), new PointF(0.75f * ((float) i), ((float) j) * 0.0f), new PointF(0.25f * ((float) i), ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(0.75f * ((float) i), ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, 0.25f * ((float) j)), new PointF(0.75f * ((float) i), 0.25f * ((float) j))});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, 0.75f * ((float) j)), new PointF(((float) i) * 0.0f, 0.25f * ((float) j)), new PointF(0.25f * ((float) i), 0.25f * ((float) j)), new PointF(0.25f * ((float) i), 0.75f * ((float) j))});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 0.0f, 0.75f * ((float) j)), new PointF(0.25f * ((float) i), 0.75f * ((float) j)), new PointF(0.25f * ((float) i), ((float) j) * 1.0f)});
        obj.add(new PointF[]{new PointF(0.25f * ((float) i), 0.75f * ((float) j)), new PointF(0.75f * ((float) i), 0.75f * ((float) j)), new PointF(0.75f * ((float) i), ((float) j) * 1.0f), new PointF(0.25f * ((float) i), ((float) j) * 1.0f)});
        obj.add(new PointF[]{new PointF(0.75f * ((float) i), 0.75f * ((float) j)), new PointF(((float) i) * 1.0f, 0.75f * ((float) j)), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(0.75f * ((float) i), ((float) j) * 1.0f)});
        obj.add(new PointF[]{new PointF(0.75f * ((float) i), 0.75f * ((float) j)), new PointF(0.75f * ((float) i), 0.25f * ((float) j)), new PointF(((float) i) * 1.0f, 0.25f * ((float) j)), new PointF(((float) i) * 1.0f, 0.75f * ((float) j))});
        obj.add(new PointF[]{new PointF(0.75f * ((float) i), 0.75f * ((float) j)), new PointF(0.75f * ((float) i), 0.25f * ((float) j)), new PointF(0.25f * ((float) i), 0.25f * ((float) j)), new PointF(0.25f * ((float) i), 0.75f * ((float) j))});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.0f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.3333333f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.3333333f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.0f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.6666667f, ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.3333333f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.6666667f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 0.0f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.3333333f, ((float) j) * 1.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.3333333f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.6666667f, ((float) j) * 1.0f), new PointF(((float) i) * 0.3333333f, ((float) j) * 1.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.6666667f, ((float) j) * 0.6666667f), new PointF(((float) i) * 1.0f, ((float) j) * 0.6666667f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 0.6666667f, ((float) j) * 1.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.6666667f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.3333333f), new PointF(((float) i) * 1.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 1.0f, ((float) j) * 0.6666667f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.6666667f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.6666667f)});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, 0.25f * ((float) j)), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(0.5f * ((float) i), ((float) j) * 0.0f), new PointF(0.5f * ((float) i), 0.25f * ((float) j))});
        obj.add(new PointF[]{new PointF(0.5f * ((float) i), ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, 0.25f * ((float) j)), new PointF(0.5f * ((float) i), 0.25f * ((float) j))});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, 0.5f * ((float) j)), new PointF(((float) i) * 0.0f, 0.25f * ((float) j)), new PointF(0.5f * ((float) i), 0.25f * ((float) j)), new PointF(0.5f * ((float) i), 0.5f * ((float) j))});
        obj.add(new PointF[]{new PointF(0.5f * ((float) i), 0.5f * ((float) j)), new PointF(0.5f * ((float) i), 0.25f * ((float) j)), new PointF(((float) i) * 1.0f, 0.25f * ((float) j)), new PointF(((float) i) * 1.0f, 0.5f * ((float) j))});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, 0.75f * ((float) j)), new PointF(((float) i) * 0.0f, 0.5f * ((float) j)), new PointF(0.5f * ((float) i), 0.5f * ((float) j)), new PointF(0.5f * ((float) i), 0.75f * ((float) j))});
        obj.add(new PointF[]{new PointF(0.5f * ((float) i), 0.75f * ((float) j)), new PointF(0.5f * ((float) i), 0.5f * ((float) j)), new PointF(((float) i) * 1.0f, 0.5f * ((float) j)), new PointF(((float) i) * 1.0f, 0.75f * ((float) j))});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 0.0f, 0.75f * ((float) j)), new PointF(((float) i) * 0.3333333f, 0.75f * ((float) j)), new PointF(((float) i) * 0.3333333f, ((float) j) * 1.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.3333333f, ((float) j) * 1.0f), new PointF(((float) i) * 0.6666667f, ((float) j) * 1.0f), new PointF(((float) i) * 0.6666667f, 0.75f * ((float) j)), new PointF(((float) i) * 0.3333333f, 0.75f * ((float) j))});
        obj.add(new PointF[]{new PointF(((float) i) * 0.6666667f, ((float) j) * 1.0f), new PointF(((float) i) * 0.6666667f, 0.75f * ((float) j)), new PointF(((float) i) * 1.0f, 0.75f * ((float) j)), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f)});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, 0.375f * ((float) j)), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(0.25f * ((float) i), ((float) j) * 0.0f), new PointF(0.25f * ((float) i), 0.375f * ((float) j))});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, 0.75f * ((float) j)), new PointF(((float) i) * 0.0f, 0.375f * ((float) j)), new PointF(0.25f * ((float) i), 0.375f * ((float) j)), new PointF(0.25f * ((float) i), 0.75f * ((float) j))});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 0.0f, 0.75f * ((float) j)), new PointF(0.375f * ((float) i), 0.75f * ((float) j)), new PointF(0.375f * ((float) i), ((float) j) * 1.0f)});
        obj.add(new PointF[]{new PointF(0.25f * ((float) i), 0.25f * ((float) j)), new PointF(0.625f * ((float) i), 0.25f * ((float) j)), new PointF(0.625f * ((float) i), ((float) j) * 0.0f), new PointF(0.25f * ((float) i), ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(0.625f * ((float) i), 0.25f * ((float) j)), new PointF(((float) i) * 1.0f, 0.25f * ((float) j)), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(0.625f * ((float) i), ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(0.375f * ((float) i), 0.75f * ((float) j)), new PointF(0.75f * ((float) i), 0.75f * ((float) j)), new PointF(0.75f * ((float) i), ((float) j) * 1.0f), new PointF(0.375f * ((float) i), ((float) j) * 1.0f)});
        obj.add(new PointF[]{new PointF(0.25f * ((float) i), 0.75f * ((float) j)), new PointF(0.25f * ((float) i), 0.25f * ((float) j)), new PointF(0.75f * ((float) i), 0.25f * ((float) j)), new PointF(0.75f * ((float) i), 0.75f * ((float) j))});
        obj.add(new PointF[]{new PointF(((float) i) * 1.0f, 0.25f * ((float) j)), new PointF(0.75f * ((float) i), 0.25f * ((float) j)), new PointF(0.75f * ((float) i), 0.625f * ((float) j)), new PointF(((float) i) * 1.0f, 0.625f * ((float) j))});
        obj.add(new PointF[]{new PointF(0.75f * ((float) i), ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, 0.625f * ((float) j)), new PointF(0.75f * ((float) i), 0.625f * ((float) j))});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 0.0f, ((float) j) * 0.3333333f), new PointF(0.25f * ((float) i), ((float) j) * 0.3333333f), new PointF(0.25f * ((float) i), ((float) j) * 1.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.0f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.3333333f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.3333333f, ((float) j) * 0.3333333f), new PointF(((float) i) * 1.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(0.25f * ((float) i), ((float) j) * 0.3333333f), new PointF(0.5f * ((float) i), ((float) j) * 0.3333333f), new PointF(0.5f * ((float) i), ((float) j) * 0.6666667f), new PointF(0.25f * ((float) i), ((float) j) * 0.6666667f)});
        obj.add(new PointF[]{new PointF(0.5f * ((float) i), ((float) j) * 0.6666667f), new PointF(0.5f * ((float) i), ((float) j) * 0.3333333f), new PointF(0.75f * ((float) i), ((float) j) * 0.3333333f), new PointF(0.75f * ((float) i), ((float) j) * 0.6666667f)});
        obj.add(new PointF[]{new PointF(0.75f * ((float) i), ((float) j) * 0.6666667f), new PointF(0.75f * ((float) i), ((float) j) * 0.3333333f), new PointF(((float) i) * 1.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 1.0f, ((float) j) * 0.6666667f)});
        obj.add(new PointF[]{new PointF(0.25f * ((float) i), ((float) j) * 1.0f), new PointF(0.5f * ((float) i), ((float) j) * 1.0f), new PointF(0.5f * ((float) i), ((float) j) * 0.6666667f), new PointF(0.25f * ((float) i), ((float) j) * 0.6666667f)});
        obj.add(new PointF[]{new PointF(0.5f * ((float) i), ((float) j) * 1.0f), new PointF(0.75f * ((float) i), ((float) j) * 1.0f), new PointF(0.75f * ((float) i), ((float) j) * 0.6666667f), new PointF(0.5f * ((float) i), ((float) j) * 0.6666667f)});
        obj.add(new PointF[]{new PointF(0.75f * ((float) i), ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.6666667f), new PointF(0.75f * ((float) i), ((float) j) * 0.6666667f)});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, 0.25f * ((float) j)), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.0f), new PointF(((float) i) * 0.3333333f, 0.25f * ((float) j))});
        obj.add(new PointF[]{new PointF(((float) i) * 0.3333333f, ((float) j) * 0.0f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.0f), new PointF(((float) i) * 0.6666667f, 0.25f * ((float) j)), new PointF(((float) i) * 0.3333333f, 0.25f * ((float) j))});
        obj.add(new PointF[]{new PointF(((float) i) * 0.6666667f, 0.25f * ((float) j)), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, 0.25f * ((float) j))});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, 0.5f * ((float) j)), new PointF(((float) i) * 0.0f, 0.25f * ((float) j)), new PointF(((float) i) * 0.3333333f, 0.25f * ((float) j)), new PointF(((float) i) * 0.3333333f, 0.5f * ((float) j))});
        obj.add(new PointF[]{new PointF(((float) i) * 0.3333333f, 0.5f * ((float) j)), new PointF(((float) i) * 0.6666667f, 0.5f * ((float) j)), new PointF(((float) i) * 0.6666667f, 0.25f * ((float) j)), new PointF(((float) i) * 0.3333333f, 0.25f * ((float) j))});
        obj.add(new PointF[]{new PointF(((float) i) * 0.6666667f, 0.5f * ((float) j)), new PointF(((float) i) * 1.0f, 0.5f * ((float) j)), new PointF(((float) i) * 1.0f, 0.25f * ((float) j)), new PointF(((float) i) * 0.6666667f, 0.25f * ((float) j))});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 0.0f, 0.5f * ((float) j)), new PointF(((float) i) * 0.6666667f, 0.5f * ((float) j)), new PointF(((float) i) * 0.6666667f, ((float) j) * 1.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 1.0f, 0.5f * ((float) j)), new PointF(((float) i) * 0.6666667f, 0.5f * ((float) j)), new PointF(((float) i) * 0.6666667f, 0.75f * ((float) j)), new PointF(((float) i) * 1.0f, 0.75f * ((float) j))});
        obj.add(new PointF[]{new PointF(((float) i) * 0.6666667f, ((float) j) * 1.0f), new PointF(((float) i) * 0.6666667f, 0.75f * ((float) j)), new PointF(((float) i) * 1.0f, 0.75f * ((float) j)), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f)});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(0.2f * ((float) i), ((float) j) * 1.0f), new PointF(0.2f * ((float) i), ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(0.4f * ((float) i), ((float) j) * 0.0f), new PointF(0.2f * ((float) i), ((float) j) * 0.0f), new PointF(0.2f * ((float) i), 0.5f * ((float) j)), new PointF(0.4f * ((float) i), 0.5f * ((float) j))});
        obj.add(new PointF[]{new PointF(0.6f * ((float) i), ((float) j) * 0.0f), new PointF(0.4f * ((float) i), ((float) j) * 0.0f), new PointF(0.4f * ((float) i), 0.5f * ((float) j)), new PointF(0.6f * ((float) i), 0.5f * ((float) j))});
        obj.add(new PointF[]{new PointF(0.8f * ((float) i), ((float) j) * 0.0f), new PointF(0.6f * ((float) i), ((float) j) * 0.0f), new PointF(0.6f * ((float) i), 0.5f * ((float) j)), new PointF(0.8f * ((float) i), 0.5f * ((float) j))});
        obj.add(new PointF[]{new PointF(0.8f * ((float) i), ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, 0.5f * ((float) j)), new PointF(0.8f * ((float) i), 0.5f * ((float) j))});
        obj.add(new PointF[]{new PointF(0.2f * ((float) i), ((float) j) * 1.0f), new PointF(0.4f * ((float) i), ((float) j) * 1.0f), new PointF(0.4f * ((float) i), 0.5f * ((float) j)), new PointF(0.2f * ((float) i), 0.5f * ((float) j))});
        obj.add(new PointF[]{new PointF(0.4f * ((float) i), ((float) j) * 1.0f), new PointF(0.6f * ((float) i), ((float) j) * 1.0f), new PointF(0.6f * ((float) i), 0.5f * ((float) j)), new PointF(0.4f * ((float) i), 0.5f * ((float) j))});
        obj.add(new PointF[]{new PointF(0.6f * ((float) i), ((float) j) * 1.0f), new PointF(0.8f * ((float) i), ((float) j) * 1.0f), new PointF(0.8f * ((float) i), 0.5f * ((float) j)), new PointF(0.6f * ((float) i), 0.5f * ((float) j))});
        obj.add(new PointF[]{new PointF(0.8f * ((float) i), ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, 0.5f * ((float) j)), new PointF(0.8f * ((float) i), 0.5f * ((float) j))});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(0.25f * ((float) i), ((float) j) * 0.0f), new PointF(0.25f * ((float) i), ((float) j) * 0.3333333f)});
        obj.add(new PointF[]{new PointF(0.25f * ((float) i), ((float) j) * 0.3333333f), new PointF(0.5f * ((float) i), ((float) j) * 0.3333333f), new PointF(0.5f * ((float) i), ((float) j) * 0.0f), new PointF(0.25f * ((float) i), ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(0.5f * ((float) i), ((float) j) * 0.3333333f), new PointF(0.75f * ((float) i), ((float) j) * 0.3333333f), new PointF(0.75f * ((float) i), ((float) j) * 0.0f), new PointF(0.5f * ((float) i), ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(0.75f * ((float) i), ((float) j) * 0.3333333f), new PointF(((float) i) * 1.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(0.75f * ((float) i), ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.0f, ((float) j) * 0.3333333f), new PointF(0.5f * ((float) i), ((float) j) * 0.3333333f), new PointF(0.5f * ((float) i), ((float) j) * 0.6666667f)});
        obj.add(new PointF[]{new PointF(0.5f * ((float) i), ((float) j) * 0.6666667f), new PointF(((float) i) * 1.0f, ((float) j) * 0.6666667f), new PointF(((float) i) * 1.0f, ((float) j) * 0.3333333f), new PointF(0.5f * ((float) i), ((float) j) * 0.3333333f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 0.0f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.3333333f, ((float) j) * 1.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.3333333f, ((float) j) * 1.0f), new PointF(((float) i) * 0.6666667f, ((float) j) * 1.0f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.6666667f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.6666667f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.6666667f)});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(0.25f * ((float) i), ((float) j) * 0.0f), new PointF(0.25f * ((float) i), ((float) j) * 0.3333333f)});
        obj.add(new PointF[]{new PointF(0.25f * ((float) i), ((float) j) * 0.3333333f), new PointF(0.5f * ((float) i), ((float) j) * 0.3333333f), new PointF(0.5f * ((float) i), ((float) j) * 0.0f), new PointF(0.25f * ((float) i), ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(0.5f * ((float) i), ((float) j) * 0.3333333f), new PointF(0.75f * ((float) i), ((float) j) * 0.3333333f), new PointF(0.75f * ((float) i), ((float) j) * 0.0f), new PointF(0.5f * ((float) i), ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(0.75f * ((float) i), ((float) j) * 0.3333333f), new PointF(((float) i) * 1.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(0.75f * ((float) i), ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.6666667f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.3333333f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.3333333f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.6666667f, ((float) j) * 0.6666667f), new PointF(((float) i) * 1.0f, ((float) j) * 0.6666667f), new PointF(((float) i) * 1.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.3333333f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 0.0f, ((float) j) * 0.6666667f), new PointF(0.5f * ((float) i), ((float) j) * 0.6666667f), new PointF(0.5f * ((float) i), ((float) j) * 1.0f)});
        obj.add(new PointF[]{new PointF(0.5f * ((float) i), ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.6666667f), new PointF(0.5f * ((float) i), ((float) j) * 0.6666667f)});
        this.collageLayoutList.add(new CollageLayout(obj));
    }
}
