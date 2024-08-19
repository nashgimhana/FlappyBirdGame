package com.example.flappybirdgame.sprites;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

import com.example.flappybirdgame.R;

public class Background implements Sprite{

    private int screenHeight;
    Bitmap top,bottom;
    private int topHeight,bottomHeight;

    public Background(Resources resources, int screenHeight) {
    this.screenHeight=screenHeight;
    topHeight=(int) resources.getDimension(R.dimen.bkg_top_hight);
    bottomHeight=(int) resources.getDimension(R.dimen.bkg_bottom_height);

    Bitmap bkgTop= BitmapFactory.decodeResource(resources,R.drawable.sky);
    Bitmap bkgBottom= BitmapFactory.decodeResource(resources,R.drawable.ground);

    top=Bitmap.createScaledBitmap(bkgTop,bkgTop.getWidth(),topHeight,false);
    bottom=Bitmap.createScaledBitmap(bkgBottom,bkgBottom.getWidth(),bottomHeight,false);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawBitmap(top,0,0,null);
        canvas.drawBitmap(top, top.getWidth(),0,null);
        canvas.drawBitmap(bottom,0,screenHeight-bottom.getHeight(),null);
        canvas.drawBitmap(bottom,bottom.getWidth(),0,null);
    }

    @Override
    public void update() {

    }
}
