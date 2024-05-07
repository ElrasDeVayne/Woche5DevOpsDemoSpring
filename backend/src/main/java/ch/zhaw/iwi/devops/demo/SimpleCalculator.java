package ch.zhaw.iwi.devops.demo;

// SimpleCalculator.java

public class SimpleCalculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return (double) a / b;
    }

    // Adding modulus method
    public int modulus(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Modulus by zero");
        }
        return a % b;
    }

    // Adding power method
    public double power(int a, int b) {
        return Math.pow(a, b);
    }
}

