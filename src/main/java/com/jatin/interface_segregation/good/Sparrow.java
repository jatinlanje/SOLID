package com.jatin.interface_segregation.good;

public class Sparrow implements Flyable{
    @Override
    public void fly() {
        // Fly implementation
    }
}
/*
we split the responsibilities into smaller interfaces,
allowing the implementing classes to choose the interfaces they need to implement.
 */