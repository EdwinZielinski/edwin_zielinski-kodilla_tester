package com.kodilla.inheritance.Homework;

public class OperetingSystem {
    private int year;
    public void turnOn(){
    System.out.println("Turn on the System");
    }
    public void turnOff(){
        System.out.println("Tun off the System");
    }
    public void OperetingSystem(int year){
    this.year = year;
    }
    public int getYear(){
        return year;
    }
}
