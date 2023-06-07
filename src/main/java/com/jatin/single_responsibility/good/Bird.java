package com.jatin.single_responsibility.good;

public class Bird implements Flyable,Swimmable{

    @Override
    public void fly() {
        //Fly implementation
    }

    @Override
    public void swim() {
        //Swim implementation
    }
}
/*
we follow the SRP by separating the responsibilities into separate interfaces: Flyable, Swimmable.
The Bird class now implements these interfaces individually.
 */