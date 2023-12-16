package org.example;
import java.awt.*;

public class TetrisBoard {
    public static final int ROWS = 20;
    public static final int COLUMNS = 10;

    private Color[][] board;

    public TetrisBoard() {
        board = new Color[ROWS][COLUMNS];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                board[row][col] = Color.BLACK;
            }
        }
    }

    public Color[][] getBoard() {
        return board;
    }

    public void draw(Graphics g) {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                g.setColor(board[row][col]);
                g.fillRect(col * 30, row * 30, 30, 30);
                g.setColor(Color.GRAY);
                g.drawRect(col * 30, row * 30, 30, 30);
            }
        }
    }

    // Metody do implementacji ruchu klocka
    // np. moveLeft(), moveRight(), moveDown(), rotate()

    public void moveDown() {
        // Implementacja ruchu klocka w dół
    }

    public void moveLeft() {
        // Implementacja ruchu klocka w lewo
    }

    public void moveRight() {
        // Implementacja ruchu klocka w prawo
    }

    public void rotate() {
        // Implementacja obracania klocka
    }
}
