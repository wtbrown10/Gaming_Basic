package com.in28minutes.learnspringframework.HelloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) {}
record Address (String firstLine, String city){}
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Will";
    }

    @Bean
    public int age() {
        return 25;
    }

    @Bean
    public Person person() {
        return new Person("Tom", 35, address());

    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), new Address("Main Street", "Cranston"));
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address2) {//name, age, address2
        return new Person(name(), age(), address());

    }


    @Bean(name = "address2")
    public Address address() {
        return new Address("35 Apple Street", "Providence");
    }
}

