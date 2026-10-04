package main;

public class Calculator {

	public static double sum(double a, double b) {
        return a + b;
    }

	public static double subtract(double a, double b) {
        return a - b;
    }
	
	public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }
	
	public static double module(double a, double b) {
	    return a % b;
	}

    public static void main(String[] args) {
    	System.out.println("--- HELLO WORLD!!!!!---");
    	System.out.println("==== BASIC CALCULATOR ====");
        System.out.println("Addition: " + sum(10, 5));
        System.out.println("Subtraction: " + subtract(10, 5));
        System.out.println("Division: " + divide(10, 5));
        System.out.println("Module: " + module(10, 5));
    }
}
// Test for YOLO 
// Test for paiiiiir
