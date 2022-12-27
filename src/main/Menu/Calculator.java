package main.Menu;

import main.General.Estimated.EstimatedCalc;
import main.General.Task;
import main.General.TextPaint;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator extends Task {
    public Calculator()
    {
        _title = "расчёт формулы";
    }
    public void execute() {
        vCalc();
    }
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

            System.out.print(
                    TextPaint.sANSI_BLUE + "Введите число Y: " + TextPaint.sANSI_BLUE
            );
            int inputValY = in.nextInt();

            System.out.print(
                    TextPaint.sANSI_BLUE + "Введите число Z: " + TextPaint.sANSI_BLUE
            );
            int inputValZ = in.nextInt();


            double sum = EstimatedCalc.CalcFormula(inputValX, inputValY, inputValZ);

            String formatNumber = new DecimalFormat("#0.000").format(sum);

            if (!Double.isNaN(sum)) {
                System.out.printf(TextPaint.sANSI_PURPLE + "Ваш ответ: " + formatNumber + TextPaint.sANSI_PURPLE+"\n");
            } else {
                System.out.printf(TextPaint.sANSI_PURPLE + "Ваш ответ: Не число поэтому проверьте вводимые числа, особенно то, что в корне\n" + TextPaint.sANSI_PURPLE);
                vCalc();
            }
        } catch (Exception e) {
            System.out.print(TextPaint.sANSI_RED + "Ошибка: введен недопустимый символ.\n" +
                    "Пожалуйста, проверьте корректность вводимых данных\n" + TextPaint.sANSI_RED);
//            System.out.print(e.getMessage());
            vCalc();
        }

    }
}
