package com.rokki.sanya;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

public class MyDraw extends View {
    private Paint bluePaint;
    private Paint sun;
    private Paint rectLine;
    float rotate_center_x = 200;
    float rotate_center_y = 200;
    float rotate_angle = 45;

    public MyDraw(Context context) {
        super(context);
        sun = new Paint();
        rectLine = new Paint();
        bluePaint = new Paint();
//        rectLine = new RectF(0,0,840,800);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        bluePaint.setStyle(Paint.Style.FILL);
        bluePaint.setAntiAlias(true);
        bluePaint.setColor(Color.BLUE);
        canvas.drawPaint(bluePaint);

        sun.setStyle(Paint.Style.FILL);
        sun.setAntiAlias(true);
        sun.setColor(Color.YELLOW);

        rectLine.setStyle(Paint.Style.FILL);
        rectLine.setStrokeWidth(10);
        rectLine.setAntiAlias(true);
        rectLine.setColor(Color.YELLOW);

        canvas.drawCircle(370, 370, 80, sun);

        for(int i=0; i<361; i+=10){
                canvas.drawLine(370, 370, 150, 150, rectLine);
//            поворачиваем канву на угол i
                canvas.rotate(i, 370, 370);
        }

//         возвращаем canvas на прежний угол
        canvas.rotate(rotate_angle, rotate_center_x, rotate_center_y);



    }

}

