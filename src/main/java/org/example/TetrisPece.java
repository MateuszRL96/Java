package org.example;

import java.awt.*;

public class TetrisPece {
    private Color color;
    private int[][] shape;
    private int currentRotation;


    public TetrisPece(Color color, int[][] shape) {
        this.color = color;
        this.shape = shape;
        this.currentRotation = 0;
    }

    public Color getColor(){
        return color;
    }

    public int[][] getShape(){
        return shape;
    }
    public int getCurrentRotation() {
        return currentRotation;
    }

    public void rotate() {
        currentRotation = (currentRotation + 1) % 4;
    }
}

