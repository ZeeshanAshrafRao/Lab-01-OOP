/*
 * Student Name: Zeeshan Rao
 * Lab: Week 01 - OOP
 * File: Main.java
 */

public class Main {

    public static void main(String[] args) {

        // Creating two Car objects
        Car bmw = new Car();
        Car tesla = new Car();

        // Setting details
        bmw.setDetails("BMW", "Black");
        tesla.setDetails("Tesla", "Red");

        // BMW Operations
        System.out.println("===== BMW =====");
        bmw.startEngine();
        bmw.drive();
        bmw.moveFast();
        bmw.moveLeft();
        bmw.turboMode();
        bmw.displayState();

        // Tesla Operations
        System.out.println("\n===== TESLA =====");
        tesla.startEngine();
        tesla.drive();
        tesla.moveSlow();
        tesla.moveRight();
        tesla.displayState();

        // Stop Engines
        System.out.println("\n===== STOPPING CARS =====");
        bmw.stopEngine();
        tesla.stopEngine();

        // Final State
        bmw.displayState();
        tesla.displayState();
    }
}