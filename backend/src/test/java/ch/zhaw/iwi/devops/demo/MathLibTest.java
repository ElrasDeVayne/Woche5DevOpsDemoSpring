package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MathLibTest {

 
    private MathLib mathlib;

    @BeforeEach
    public void setUp() {
        mathlib = new MathLib();
    }


    @Test
    void testIsEven() {
        assertTrue(MathLib.isEven((2)));
        assertFalse(MathLib.isEven(3));
    }

    @Test
    public void testFibonacciIterative() {
        assertEquals(0, mathlib.fibonacciIterative(0), "Fib(0) should be 0");
        assertEquals(1, mathlib.fibonacciIterative(1), "Fib(1) should be 1");
        assertEquals(1, mathlib.fibonacciIterative(2), "Fib(2) should be 1");
        assertEquals(2, mathlib.fibonacciIterative(3), "Fib(3) should be 2");
        assertEquals(3, mathlib.fibonacciIterative(4), "Fib(4) should be 3");
        assertEquals(5, mathlib.fibonacciIterative(5), "Fib(5) should be 5");
    }

    @Test
    public void testFibonacciRecursive() {
        assertEquals(0, mathlib.fibonacciRecursive(0), "Fib(0) should be 0");
        assertEquals(1, mathlib.fibonacciRecursive(1), "Fib(1) should be 1");
        assertEquals(1, mathlib.fibonacciRecursive(2), "Fib(2) should be 1");
        assertEquals(2, mathlib.fibonacciRecursive(3), "Fib(3) should be 2");
        assertEquals(3, mathlib.fibonacciRecursive(4), "Fib(4) should be 3");
        assertEquals(5, mathlib.fibonacciRecursive(5), "Fib(5) should be 5");
    }


}
