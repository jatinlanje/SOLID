package com.jatin.open_closed.good;

public class Bird {
    class Sparrow implements Flyable{
        @Override
        public void fly() {
            // Fly implementation for Sparrow
        }
    }
    class Swan implements Flyable{
        @Override
        public void fly() {
            // Fly implementation for Swan
        }
    }
}
/*
we follow the OCP by introducing the Flyable interface, which represents the common behavior of flying.
Each bird type now implements the Flyable interface individually,
and we can easily introduce new bird types without modifying existing code.
 */