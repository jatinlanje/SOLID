package com.jatin.liskov_substitution.bad;

public class Penguin extends Bird{
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly");
    }
}
/*
Penguin class violates the LSP because it overrides the fly method and throws an exception,
which breaks the substitutability with its base class.
 */