package main.General.Estimated;

import java.math.BigInteger;

import static main.General.Validation.ValidationValue.vValZero;

public class EstimatedCalc {
    public static double CalcFormula(int valX, int valY, int valZ) {
        vValZero(valX, "x");
        vValZero(valY, "y");
        return (valZ / valX) + (7 * Math.sqrt(valY));
    }

    public static BigInteger factorial(int number) {
        BigInteger factorial = BigInteger.ONE;

        for (int i = number; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }
}
