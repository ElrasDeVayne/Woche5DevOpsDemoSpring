// SimpleCalculatorTest.java
package ch.zhaw.iwi.devops.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void add() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(2, -3));
    }

    @Test
    void testSubtract() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(-1, calculator.subtract(2, 3));
        assertEquals(5, calculator.subtract(2, -3));
    }

    @Test
    void testMultiply() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-6, calculator.multiply(2, -3));
    }

    @Test
    void testDivide() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(2.0, calculator.divide(6, 3), 0.0001);
        assertEquals(-2.0, calculator.divide(6, -3), 0.0001);

        // Test division by zero
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(6, 0);
        });
        assertEquals("Division by zero", exception.getMessage());
    }

        @Test
    void testModulus() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(1, calculator.modulus(7, 3));
        assertEquals(0, calculator.modulus(6, 3));

        // Test modulus by zero
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.modulus(6, 0);
        });
        assertEquals("Modulus by zero", exception.getMessage());
    }

    @Test
    void testPower() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(8, calculator.power(2, 3), 0.0001);
        assertEquals(1, calculator.power(2, 0), 0.0001);
        assertEquals(0.125, calculator.power(2, -3), 0.0001);

        // Intentionally failing test
        assertEquals(9, calculator.power(2, 3), 0.0001); // This will fail as 2^3 is 8, not 9
    }
 
}
