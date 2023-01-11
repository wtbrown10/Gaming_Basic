package com.in28minutes.learnspringframework.HelloWorld;

import com.in28minutes.learnspringframework.HelloWorld.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;


public class App02HelloWorldSpring {
    public static void main(String[] args) {
        try(// 1: Launch a spring context
            var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {


            // 2: Configure the things we want spring to manage with class called - @Configuration
            //helloWorldConfiguration
            //name - @Bean

            // 3: Retrieving Beans managed by spring
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("address2"));
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3Parameters"));
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }


    }
}
