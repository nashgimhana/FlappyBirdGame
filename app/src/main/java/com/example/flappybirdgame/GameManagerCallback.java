package com.example.flappybirdgame;

import android.graphics.Rect;

import com.example.flappybirdgame.sprites.Obstacle;

import java.util.ArrayList;

public interface GameManagerCallback {
    void updatePosition(Rect birdPosition);
    void updatePosition(Obstacle obstacle, ArrayList<Rect> positions);
    void removeObstacle(Obstacle obstacle);
}
