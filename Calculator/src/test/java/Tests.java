import org.example.Calculate;
import org.junit.jupiter.api.BeforeEach;import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Tests {

    private Calculate calculator;

    @BeforeEach
    public void setUp() {

        calculator = new Calculate();
    }
    // Универсальный метод для тестирования операций
    private void testOperation(double num1, double num2, double expected, String operation)
    {  double result;
        switch (operation) {
            case "add":
            result = Calculate.add(num1, num2);
            break;
            case "subtract":
                result = Calculate.subtract(num1, num2);
                break;
                  case "multiply":
                result = Calculate.multiply(num1, num2);
                break;
            case "divide":
                if (num2 == 0) {
                   assertThrows(ArithmeticException.class, () -> Calculate.divide(num1, num2));
                   return;
            } else {
                    result = Calculate.divide(num1, num2);
            }
                break;
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }        assertEquals(expected, result, 0.001, "Ошибка в операции " + operation);
    }
    @Test    public void testAddition() {
        testOperation(10.0, 5.0, 15.0, "add");        testOperation(-2.0, 3.0, 1.0, "add");
    }
    @Test    public void testSubtraction() {
        testOperation(10.0, 5.0, 5.0, "subtract");        testOperation(-2.0, -3.0, 1.0, "subtract");
    }
    @Test    public void testMultiplication() {
        testOperation(10.0, 5.0, 50.0, "multiply");        testOperation(-2.0, 3.0, -6.0, "multiply");
    }
    @Test    public void testDivision() {
        testOperation(10.0, 5.0, 2.0, "divide");        testOperation(9.0, 3.0, 3.0, "divide");
    }

}