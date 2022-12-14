package com.rae.friends.Classes;

import javax.swing.JFrame;

public class Frame extends JFrame {
    int x, y;
    boolean visible;

    public Frame(int x, int y){
        this.x = x;
        this.y = y;        

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        updateFrame();
    }

    public void updateFrame(){
        this.setSize(this.x, this.y);
        this.setVisible(this.visible);

        this.setLocationRelativeTo(null);
    }

    public void isVisible(boolean visible){
        this.visible = visible;
        this.updateFrame();
    }
} 
