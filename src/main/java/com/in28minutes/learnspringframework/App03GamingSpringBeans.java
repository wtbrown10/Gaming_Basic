package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(GameRunner.GamingConfiguration.class);
        context.getBean(GamingConsole.class);



        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PacmanGame();// object creation
        var gameRunner = new GameRunner(game); // object creation + Wiring of Dependencies
        // Game is a Dependency of gamerunner
        gameRunner.run();
    }
}
