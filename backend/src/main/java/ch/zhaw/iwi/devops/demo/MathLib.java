package ch.zhaw.iwi.devops.demo;

public class MathLib {
    
    public static boolean isEven(int value) {
        return value % 2  == 0;
    }

    // Iterative method to find Fibonacci number
    public int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

    // Recursive method to find Fibonacci number
    public int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }
    
}