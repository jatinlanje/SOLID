package com.jatin.dependency_inversion.good;

class Bird {
    private String type;
    private Flyable flyable;

    public Bird(String type, Flyable flyable) {
        this.type = type;
        this.flyable = flyable;
    }

    public void fly() {
        flyable.fly();
    }
}
/*
we introduce the Flyable interface,
and the Bird class depends on the abstraction (Flyable) rather than concrete implementations.
This allows us to decouple the Bird class from specific bird types and enables easier extension.
 */