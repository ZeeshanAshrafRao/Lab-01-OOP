/*
 * Student Name: Zeeshan Rao
 * Lab: Week 01 - OOP
 * File: Car.java
 */

public class Car {

    // Attributes
    private String brand;
    private String color;
    private int speed;
    private boolean engineOn;

    // Extra Attributes
    private int fuelLevel;
    private int gear;

    // No-Argument Constructor
    public Car() {
        this.brand = "Unknown";
        this.color = "White";
        this.speed = 0;
        this.engineOn = false;
        this.fuelLevel = 100;
        this.gear = 0;
    }

    // Set Details
    public void setDetails(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    // Start Engine
    public void startEngine() {
        engineOn = true;
        System.out.println(brand + " engine started.");
    }

    // Stop Engine
    public void stopEngine() {
        speed = 0;
        gear = 0;
        engineOn = false;
        System.out.println(brand + " engine stopped.");
    }

    // Drive
    public void drive() {
        if(engineOn) {
            speed = 40;
            gear = 2;
            fuelLevel -= 5;
            System.out.println(brand + " is driving.");
        }
        else {
            System.out.println("Start the engine first!");
        }
    }

    // Move Fast
    public void moveFast() {
        if(engineOn) {
            speed += 40;
            gear = 5;
            fuelLevel -= 10;
            System.out.println(brand + " is moving fast.");
        }
        else {
            System.out.println("Engine is OFF.");
        }
    }

    // Move Slow
    public void moveSlow() {
        if(engineOn && speed > 20) {
            speed -= 20;
            gear = 2;
            System.out.println(brand + " is moving slowly.");
        }
    }

    // Turn Left
    public void moveLeft() {
        System.out.println(brand + " turned left.");
    }

    // Turn Right
    public void moveRight() {
        System.out.println(brand + " turned right.");
    }

    // Creative Feature
    public void turboMode() {
        if(engineOn) {
            speed += 60;
            fuelLevel -= 20;
            System.out.println("Turbo Mode Activated!");
        }
    }

    // Display State
    public void displayState() {

        System.out.println("\n------ CAR DETAILS ------");
        System.out.println("Brand      : " + brand);
        System.out.println("Color      : " + color);
        System.out.println("Speed      : " + speed + " km/h");
        System.out.println("Fuel Level : " + fuelLevel + "%");
        System.out.println("Gear       : " + gear);
        System.out.println("Engine ON  : " + engineOn);
        System.out.println("-------------------------");
    }
}