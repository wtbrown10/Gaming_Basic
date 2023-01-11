package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class GameRunner {
    private GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run(){
        // TODO Auto-generated method stub
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }

    @Configuration
    public static class GamingConfiguration {
        @Bean
        public GamingConsole game() {
            var game = new PacmanGame();
            return game;
        }

        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PacmanGame();// object creation
        var gameRunner = new GameRunner(game); // object creation + Wiring of Dependencies
        // Game is a Dependency of gamerunner
            gameRunner.run();
    }
}
