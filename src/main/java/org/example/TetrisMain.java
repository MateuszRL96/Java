package org.example;

import javax.swing.*;

public class TetrisMain {
    public static void main(String[] args) {
        TetrisGame tetrisGame = new TetrisGame();
        tetrisGame.setSize(300, 600);
        tetrisGame.setTitle("Tetris Game");
        tetrisGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tetrisGame.setVisible(true);
    }
}
