package com.jatin.single_responsibility.bad;

class Bird {
    public void fly() {
        // Fly implementation
    }

    public void swim() {
        // Swim implementation
    }

}
/*
Bird class violates the SRP because it has multiple responsibilities: flying, swimming.
If any of these behaviors change, the class needs to be modified.
 */
