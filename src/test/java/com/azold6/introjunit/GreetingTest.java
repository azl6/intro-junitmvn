package com.azold6.introjunit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingTest {
    Greeting greeting;

    @BeforeEach
    void setUp(){
        System.out.println("In @BeforeEach...");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Alex"));
    }
}