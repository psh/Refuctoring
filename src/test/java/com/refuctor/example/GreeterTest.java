package com.refuctor.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreeterTest {

    @Test
    public void testGreeting() {
        Greeter g = new Greeter();

        assertEquals("Hello, World!", g.getGreeting());
    }

}
