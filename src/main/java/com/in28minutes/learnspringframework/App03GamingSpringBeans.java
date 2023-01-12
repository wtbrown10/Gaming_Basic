package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {

        try(// Create a spring context to manage GamingConfiguration class with the @bean GamingConsole
            var context = new AnnotationConfigApplicationContext
                    (GamingConfiguration.class)){

            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }


    }
}
