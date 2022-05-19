package com.azold6.introjunit;

import org.junit.jupiter.api.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeClass(){
        System.out.println("@BeforeAll, only called once");
    }

    @BeforeEach
    void setUp() {
        System.out.println("@BeforeEach");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());

    }

    @Test
    void helloWorld1() {
        System.out.println(greeting.helloWorld("John"));
    }

    @Test
    void helloWorld2() {
        System.out.println(greeting.helloWorld("Sam"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach");
    }

    @AfterAll
    public static void afterClass(){
        System.out.println("@AfterAll, only called once");
    }
}