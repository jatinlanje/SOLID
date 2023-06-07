package com.jatin.interface_segregation.good;

public class Penguin implements Swimmable{
    @Override
    public void swim() {
        // Swim implementation
    }
}
/*
we split the responsibilities into smaller interfaces,
allowing the implementing classes to choose the interfaces they need to implement.
 */
