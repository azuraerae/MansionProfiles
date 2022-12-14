package com.rae.friends.Classes;

import javax.swing.JFrame;

public class Frame extends JFrame {
    int x, y;
    boolean visible;

    public Frame(int x, int y){
        setSize(x, y);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void updateFrame(){
        this.setSize(this.x, this.y);
        this.setVisible(this.visible);
    }

    public void isVisible(boolean visible){
        this.visible = visible;
    }
} 
