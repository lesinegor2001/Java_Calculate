import org.example.Calculate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    void testAdd() {
        assertEquals(5, Calculate.add(2, 3));
        assertEquals(0, Calculate.add(-1, 1));
        assertEquals(-5, Calculate.add(-2, -3));
    }

    @Test
    void testSubtract() {
        assertEquals(-1, Calculate.subtract(2, 3));
        assertEquals(-2, Calculate.subtract(-1, 1));
        assertEquals(1, Calculate.subtract(-2, -3));
    }

    @Test
    void testMultiply() {
        assertEquals(6, Calculate.multiply(2, 3));
        assertEquals(-2, Calculate.multiply(-1, 2));
        assertEquals(6, Calculate.multiply(-2, -3));
    }

    @Test
    void testDivide() {
        assertEquals(2, Calculate.divide(6, 3));
        assertEquals(-3, Calculate.divide(-6, 2));
        assertEquals(0, Calculate.divide(0, 1));
    }

    @Test
    void testDivideByZero() {
        assertTrue(Double.isInfinite(Calculate.divide(1, 0)) );
    }
}




