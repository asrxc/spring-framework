package com.project.learn_spring_framework;

import com.project.learn_spring_framework.game.GameConsole;
import com.project.learn_spring_framework.game.GameRunner;
import com.project.learn_spring_framework.game.MarioGame;
import com.project.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasicJava_01 {
    public static void main(String[] args){
        GameConsole marioGame = new MarioGame();
        GameRunner gameRunner = new GameRunner(marioGame);

        gameRunner.run();
        GameConsole superContraGame = new SuperContraGame();
        gameRunner = new GameRunner(superContraGame);
        gameRunner.run();
    }
}
