package LabaratoryThree.LaboratoryTwo;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {

    public static void vCalc() {
        //Z/X + 7*sqrt(Y)
        Scanner in = new Scanner(System.in);
        System.out.print(
                TextPaint.sANSI_BLUE + "Формула: Z/X + 7*sqrt(Y)\n" + TextPaint.sANSI_BLUE
        );
        try {
            System.out.print(
                    TextPaint.sANSI_BLUE + "Введите число X: " + TextPaint.sANSI_BLUE
            );
            int inputValX = in.nextInt();
            if (inputValX == 0) {
                System.out.print(
                        TextPaint.sANSI_RED + "Вводимое число не должно быть меньше или равное 0. \nПовторите ввод заново\n" + TextPaint.sANSI_RED
                );
                vCalc();
            }
            System.out.print(
                    TextPaint.sANSI_BLUE + "Введите число Y: " + TextPaint.sANSI_BLUE
            );
            int inputValY = in.nextInt();
            if (inputValY < 0) {
                System.out.print(
                        TextPaint.sANSI_RED + "Вводимое число не должно быть меньше или равное 0. \nПовторите ввод заново\n" + TextPaint.sANSI_RED
                );
                vCalc();
            }
            System.out.print(
                    TextPaint.sANSI_BLUE + "Введите число Z: " + TextPaint.sANSI_BLUE

            );
            int inputValZ = in.nextInt();
            double sum = (inputValZ / inputValX) + (7 * Math.sqrt(inputValY));

            String formatNumber = new DecimalFormat("#0.000").format(sum);
            if (!Double.isNaN(sum)) {
                System.out.printf(TextPaint.sANSI_PURPLE + "Ваш ответ: " + formatNumber + TextPaint.sANSI_PURPLE);
            } else {
                System.out.printf(TextPaint.sANSI_PURPLE + "Ваш ответ: Не число поэтому провероверьте вводиммые числа, особенно то, что в корне\n" + TextPaint.sANSI_PURPLE);
                vCalc();
            }
        } catch (Exception e) {

            System.out.print(TextPaint.sANSI_RED + "Ошибка: введен недопустимый символ.\n" +
                    "Пожалуйста, проверьте корректность вводимых данных\n" + TextPaint.sANSI_RED);
            vCalc();
        }

    }

    public static BigInteger factorial(int number) {
        BigInteger factorial = BigInteger.ONE;

        for (int i = number; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }
}
