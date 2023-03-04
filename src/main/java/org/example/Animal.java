package org.example;

public class Animal implements Moveable {
    private int steps;

    @Override
    public void moveForward() {
        steps++;
    }
}
