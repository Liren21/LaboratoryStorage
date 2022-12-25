package test;

import main.General.Estimated.EstimatedCalc;
import main.General.Validation.ValidationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @Test
    @DisplayName("Проверка калькулятора")
    public void TestsCalculatorTrue() throws ValidationException {
        int x = 1;
        int y = 2;
        int z = 3;
        double expected = 12.899494936611665;
        Assertions.assertEquals(expected, EstimatedCalc.CalcFormula(x, y, z));
    }

    @Test
    @DisplayName("Проверка калькулятора исключения для х")
    public void TestsCalculatorException() {
        int x = 0;
        int y = 2;
        int z = 3;
        assertThrows(Exception.class, () -> {
             EstimatedCalc.CalcFormula(x, y, z);
        });
    }
    @Test
    @DisplayName("Проверка калькулятора исключения для y")
    public void TestsCalculatorExceptionTwo() {
        int x = 1;
        int y = -1;
        int z = 3;
        assertThrows(Exception.class, () -> {
             EstimatedCalc.CalcFormula(x, y, z);
        });
    }

}