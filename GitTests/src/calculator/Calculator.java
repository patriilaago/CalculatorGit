package calculator;

public class Calculator {
	public static double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("=== BASIC CALCULATOR ===");
        System.out.println("Suma: " + sumar(10, 5));
       
    }
}
