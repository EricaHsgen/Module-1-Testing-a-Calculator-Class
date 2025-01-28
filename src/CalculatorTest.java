import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(10, calc.add(3, 7));
    }

    @Test
    public void testAddNegatives() {
        assertEquals(-4, calc.add(3, -7));
    }

    @Test
    public void testSubtract() {
        assertEquals(10, calc.subtract(11, 1));
    }

    @Test
    public void testSubtractNegatives() {
        assertEquals(12, calc.subtract(11, -1));
    }

    @Test
    public void testMult() {
        assertEquals(21, calc.multiply(7, 3));
    }

    @Test
    public void testMultByZero() {
        assertEquals(0, calc.multiply(100, 0));
    }

    @Test
    public void testDivide() {
        assertEquals(3, calc.divide(21, 7));
    }

    @Test
    public void testDivByZero() {
        assertEquals(true, Double.isInfinite(calc.divide(1, 0)));
    }
}