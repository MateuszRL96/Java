package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TetrisGame extends JFrame implements ActionListener {

    private TetrisBoard board;
    private Timer timer;

    public TetrisGame()
    {
        board = new TetrisBoard();
        timer = new Timer(1000, this);
        timer.start();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }


}
