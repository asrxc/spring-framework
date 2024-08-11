package com.project.learn_spring_framework.game;

public class MarioGame implements GameConsole{
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Go inside");
    }
    public void right(){
        System.out.println("Go right");
    }
    public void left(){
        System.out.println("Go back");
    }
}
