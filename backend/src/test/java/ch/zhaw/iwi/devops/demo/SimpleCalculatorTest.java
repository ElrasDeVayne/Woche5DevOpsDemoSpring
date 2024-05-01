// SimpleCalculatorTest.java
package ch.zhaw.iwi.devops.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleCalculatorTest {

    @Test
    void testAdd() {
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
 
}
