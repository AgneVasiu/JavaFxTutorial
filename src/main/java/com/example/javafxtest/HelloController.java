package com.example.javafxtest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloController {

    @FXML
    //declaring circle
    private Circle myCircle;
    //declaring x axis
    private double x;
    //declaring y axis
    private double y;

    private  double z;

    public void up(ActionEvent e){
        // prints in console which direction is pressed
        System.out.println("UP");
        // show in application circle movement in pixels up in y, axis
        myCircle.setCenterY(y-=15);

    }
    public void down(ActionEvent e){
        myCircle.setCenterY(y+=15);
       System.out.println("DOWN");
    }
    public void left (ActionEvent e){
       System.out.println("LEFT");
        // show in application circle movement in pixels up in x, axis
        myCircle.setCenterX(x-=15);
    }
    public void right (ActionEvent e){
        System.out.println("RIGHT");
        myCircle.setCenterX(x+=15);
    }
   
}