package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{
    private int getSpeed;
    public Ford(int getSpeed){
        this.getSpeed = getSpeed;

    }
    public int getSpeed() {

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
