package test;

import main.General.Estimated.EstimatedCalc;
import main.General.Validation.ValidationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {
    @Test
    @DisplayName("Проверка калькулятора")
    public void TestsCalculator() throws ValidationException {
        int x = 5;
        BigInteger expected = BigInteger.valueOf(120);
        Assertions.assertEquals(expected, EstimatedCalc.factorial(x));
    }

    @Test
    @DisplayName("Проверка калькулятора исключения")
    public void TestsCalculatorTwo() {

        assertThrows(Exception.class, () -> {
            EstimatedCalc.factorial(-1);
        });
    }
}
