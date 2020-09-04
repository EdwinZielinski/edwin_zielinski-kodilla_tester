package com.kodilla.inheritance.Homework;

public class SystemOnOff extends OperetingSystem {

    public void turnOn(){
        System.out.println("Turn on the System");
    }
    public void turnOff(){
        System.out.println("Turn off the System");
    }

    public SystemOnOff(int year){
        super(year);
        System.out.println("System constructor");
    }
}
