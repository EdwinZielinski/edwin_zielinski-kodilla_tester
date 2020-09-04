package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{
    private int getSpeed;
    private int increaseSpeed;
    private int decreaseSpeed;
    public Opel(int getSpeed, int increaseSpeed, int decreaseSpeed) {
        this.getSpeed = getSpeed;
        this.increaseSpeed = increaseSpeed;
        this.decreaseSpeed = decreaseSpeed;
    }
    public int getSpeed() {
        return getSpeed;
    }
    @Override
    public int increaseSpeed() {
        return getSpeed + increaseSpeed;
    }
    @Override
    public int decreaseSpeed() {
        return getSpeed - decreaseSpeed;
    }
}
