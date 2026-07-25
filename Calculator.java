/*
 * Student Name: Zeeshan Rao
 * Lab: Week 01 - OOP
 * File: Calculator.java
 */

public class Calculator {

    // Addition
    public double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }

    // Power (New Operation)
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Average (New Operation)
    public double average(double a, double b) {
        return (a + b) / 2;
    }
}