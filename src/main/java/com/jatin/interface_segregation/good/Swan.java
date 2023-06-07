package com.jatin.interface_segregation.good;

public class Swan implements Flyable,Swimmable{
    @Override
    public void fly() {
        // Fly Implementation
    }
    @Override
    public void swim() {
        // Swim Implementation
    }
}
/*
we split the responsibilities into smaller interfaces,
allowing the implementing classes to choose the interfaces they need to implement.
 */