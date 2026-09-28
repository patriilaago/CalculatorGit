package main;

public class Calculator {

	public static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("=== BASIC CALCULATOR ===");
        System.out.println("Addition: " + sum(10, 5));
    }
	
}
