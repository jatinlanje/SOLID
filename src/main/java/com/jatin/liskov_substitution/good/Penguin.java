package com.jatin.liskov_substitution.good;

import com.jatin.single_responsibility.good.Swimmable;

public class Penguin implements Swimmable {
    @Override
    public void swim() {
        // Swim implementation
    }
}
/*
Penguin class doesn't attempt to override the fly method,
and instead, it focuses on its specific behavior of swimming.
 */