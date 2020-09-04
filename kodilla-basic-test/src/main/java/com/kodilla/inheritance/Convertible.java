package com.kodilla.inheritance;

public class Convertible extends Car{
    public void openRoof() {
        System.out.println("Open roof...");
    }
        public void closeRoof() {
            System.out.println("Close roof...");
        }
        @Override
        public void openDoors(){
            System.out.println("Opening 2 doors");
        }
        public Convertible(int wheels, int seats){
        super(wheels, seats);
        System.out.println("Convertible constructor");
        }
    }



