package com.jatin.interface_segregation.bad;

public interface Bird {
    void fly();
    void swim();
}
/*
Bird interface violates the ISP because it forces all implementing classes to provide implementations for all methods,
even if they don't need them.
 */