package com.example.flappybirdgame.sprites;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.MotionEvent;

public class MenuScreen implements Sprite {

    private int screenHeight, screenWidth;
    private int backgroundColor; // New variable to hold the background color

    public MenuScreen(Resources resources, int screenHeight, int screenWidth) {
        this.screenHeight = screenHeight;
        this.screenWidth = screenWidth;
        backgroundColor = Color.rgb(0, 0, 255); // Set the background color using RGB values (blue in this case)
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawColor(backgroundColor); // Set the background color

        // Draw other elements of the menu screen if needed
    }

    @Override
    public void update() {

    }

    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        float x = event.getX();
        float y = event.getY();

        if (action == MotionEvent.ACTION_UP) {
            // Handle button clicks here (similar to previous code)
        }

        return false;
    }
}
