package com.jatin.dependency_inversion.bad;

public class Bird {
    private String type;
    private Flyable flyable;

    public Bird(String type) {
        this.type = type;
        if (type.equals("Sparrow")) {
            this.flyable = new Flyable();
        } else if (type.equals("Penguin")) {
            this.flyable = new Flyable();
        } else if (type.equals("Swan")) {
            this.flyable = new Flyable();
        }
    }

    public void fly() {
        flyable.fly();
    }
}
/*
Bird class violates the DIP because it depends on concrete implementations of Flyable.
This tight coupling makes it difficult to introduce new bird types or change the behavior.
 */

