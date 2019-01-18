package com.example.salim.rgbcircles;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by Salimic on 18.01.2019.
 */

public class GameManager {
    private MainCircle mainCircle;
    private CanvasView canvasView;
    private static int width;
    private static int height;
    private Paint paint;

    public GameManager(CanvasView canvasView, int w, int h){
        this.canvasView=canvasView;
        width=w;
        height=h;
        initMainCircle();
        initPaint();
    }
    private void initPaint(){
        paint=new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    private void initMainCircle() {
        mainCircle=new MainCircle(width/2, height/2);
    }

    public void onDraw(Canvas canvas){
        canvas.drawCircle(mainCircle.getX(),mainCircle.getY(),mainCircle.getRadius(), paint);
    }

}
