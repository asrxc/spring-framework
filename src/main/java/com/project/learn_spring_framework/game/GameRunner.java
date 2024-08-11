package com.project.learn_spring_framework.game;

public class GameRunner {
    GameConsole gameConsole;
    public GameRunner(GameConsole gameConsole) {
        this.gameConsole = gameConsole;
    }

    public void run(){
        System.out.println("Running game: "+ gameConsole);
        gameConsole.up();
        gameConsole.down();
        gameConsole.left();
        gameConsole.right();
    }

}
