package com.kodilla.inheritance.Homework;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int squareResult = calculator.square(a);
        boolean correct = ResultChecker.assertEquals(25, squareResult);
        if (correct) {
            System.out.println("metoda działa poprawnie");
        }else{
            System.out.println("metoda nie działa poprawnie");
        }
        }
    }


