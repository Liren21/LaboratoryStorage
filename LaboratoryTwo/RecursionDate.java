package LaboratoryTwo;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;


public class RecursionDate {

    public static void DateInput() {

        ArrayList<Integer> al = new ArrayList<>();
        try {
            for (int i = 0; i < 4; i++) {
                int d = InputDate.iDay();
                int m = InputDate.iMonth();
                int y = InputDate.iYear();
                LocalDate date = LocalDate.of(y, m, d);
                System.out.println(date + "\n");
                al.add(d);
            }
            int sum = al.get(3) - al.get(0) + 1;
            BigInteger period = Calculator.factorial(sum);
            System.out.println(sum + "\n");
            System.out.println(period + "\n");


        } catch (Exception e) {
            System.out.print(TextPaint.sANSI_RED + "Ошибка: Жопа\n" + TextPaint.sANSI_RED);
            DateInput();
        }

    }

}
