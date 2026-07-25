/*
 * Student Name: Zeeshan Rao
 * Lab: Week 01 - OOP
 * File: Mainc.java
 */

public class Maincalc {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("===== CALCULATOR DEMO =====");

        // Addition
        System.out.println("Addition (20 + 10) = " + calc.add(20, 10));

        // Subtraction
        System.out.println("Subtraction (20 - 10) = " + calc.subtract(20, 10));

        // Multiplication
        System.out.println("Multiplication (20 × 10) = " + calc.multiply(20, 10));

        // Division (Normal Case)
        System.out.println("Division (20 ÷ 10) = " + calc.divide(20, 10));

        // Division (Edge Case)
        System.out.println("Division (20 ÷ 0) = " + calc.divide(20, 0));

        // Power
        System.out.println("Power (2^5) = " + calc.power(2, 5));

        // Average
        System.out.println("Average (20, 10) = " + calc.average(20, 10));

        System.out.println("===========================");
    }
}