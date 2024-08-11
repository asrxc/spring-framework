package com.project.learn_spring_framework.game;

public class SuperContraGame implements GameConsole {
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Sit");
    }
    public void right(){
        System.out.println("Shoot!");
    }
    public void left(){
        System.out.println("Go left");
    }
}
