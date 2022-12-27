package main.General.Estimated;

import main.General.Validation.ValidationException;

import java.math.BigInteger;

import static main.General.Validation.ValidationCustomException.vExpNoValid;
import static main.General.Validation.ValidationValue.vValZero;

public class EstimatedCalc {
    public static double CalcFormula(int valX, int valY, int valZ) {
        vValZero(valX, "x");
        vValZero(valY, "y");
        return (valZ / valX) + (7 * Math.sqrt(valY));
    }

    public static BigInteger factorial(int number) throws ValidationException {
        BigInteger factorial = null;
        if (number > 0) {
            factorial = BigInteger.ONE;

            for (int i = number; i > 0; i--) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }

        } else {
            vExpNoValid(7);
        }
        return factorial;
    }
}
