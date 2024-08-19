package com.example.flappybirdgame.sprites;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

import com.example.flappybirdgame.R;

public class GameMessage implements Sprite {

    private int screenHeight, screenWidth;
    private Bitmap message;
    private Paint paint;

    // Constants for menu items
    public static final int MENU_START_GAME = 1;
    public static final int MENU_HELP = 2;
    public static final int MENU_ABOUT = 3;

    public GameMessage(Resources resources, int screenHeight, int screenWidth) {
        this.screenHeight = screenHeight;
        this.screenWidth = screenWidth;
        message = BitmapFactory.decodeResource(resources, R.drawable.message);

        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextSize(80f);
    }

    @Override
    public void draw(Canvas canvas) {


        // Draw menu items
        int menuItemWidth = message.getWidth();
        int menuItemHeight = message.getHeight() / 4;

        paint.setColor(0xFF00FF00); // Green color for menu items

        // Draw "Start Game" menu item
        canvas.drawRect(screenWidth / 2 - menuItemWidth / 2, screenHeight / 4,
                screenWidth / 2 + menuItemWidth / 2, screenHeight / 4 + menuItemHeight, paint);
        canvas.drawText("Start Game", screenWidth / 2 - menuItemWidth / 4, screenHeight / 4 + menuItemHeight / 2, paint);

        // Draw "Help" menu item
        canvas.drawRect(screenWidth / 2 - menuItemWidth / 2, screenHeight / 4 + menuItemHeight,
                screenWidth / 2 + menuItemWidth / 2, screenHeight / 4 + 2 * menuItemHeight, paint);
        canvas.drawText("Help", screenWidth / 2 - menuItemWidth / 8, screenHeight / 4 + 3 * menuItemHeight / 2, paint);

        // Draw "About" menu item
        canvas.drawRect(screenWidth / 2 - menuItemWidth / 2, screenHeight / 4 + 2 * menuItemHeight,
                screenWidth / 2 + menuItemWidth / 2, screenHeight / 4 + 3 * menuItemHeight, paint);
        canvas.drawText("About", screenWidth / 2 - menuItemWidth / 8, screenHeight / 4 + 5 * menuItemHeight / 2, paint);
        canvas.drawBitmap(message, screenWidth / 2 - message.getWidth() / 2, screenHeight / 4, null);
    }

    @Override
    public void update() {

    }

    // Rest of the class remains the same...
}
