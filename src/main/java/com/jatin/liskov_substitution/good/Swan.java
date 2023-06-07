package com.jatin.liskov_substitution.good;

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
Swan class implements both fly and swim method.
 */
