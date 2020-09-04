package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(50, 10,20);
        doRace(ford);
        Opel opel = new Opel(60, 20, 25);
        doRace(opel);
    }
    private static void doRace(Car car){
        System.out.println(car.increaseSpeed());
        System.out.println(car.decreaseSpeed());
        System.out.println((car.getSpeed()));
    }

}
