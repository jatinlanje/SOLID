package com.jatin.open_closed.bad;

public class Bird {
    private String type;
    public void fly(){
        if(type.equals("Sparrow")){
            // Fly implementation for Sparrow
        }
        else if(type.equals("Penguin")){
            // Fly implementation for Penguin
        }
        else if(type.equals("Swan")){
            // Fly implementation for Swan
        }
    }
}
/*
Bird class violates the OCP because it has conditional logic that checks the type of bird to determine the fly behavior.
If we introduce a new type of bird, we would need to modify this class.
 */
