package test;

import main.General.Estimated.EstimatedCalc;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ValidationValueTests {



    @Test
    @DisplayName("Проверка калькулятора")
    public void TestsCalculator() {
        int x = 1;
        int y = 2;
        int z = 3;
        double expected = 12.899494936611665;
        assertEquals(expected, EstimatedCalc.CalcFormula(x, y, z));
    }



}
