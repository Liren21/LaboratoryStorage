package LabaratoryThree.LaboratoryTwo;

import LaboratoryTwo.Calculator;
import LaboratoryTwo.InputDate;
import LaboratoryTwo.TextPaint;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;


public class RecursionDate {
    public static void DateInput() {
        ArrayList<Integer> day = new ArrayList<>();
        ArrayList<Integer> month = new ArrayList<>();
        ArrayList<Integer> year = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listTwo = new ArrayList<>();

        try {
            for (int i = 0; i < 4; i++) {
                int d = LaboratoryTwo.InputDate.iDay();
                System.out.println(d + "\n");
                int m = LaboratoryTwo.InputDate.iMonth();
                System.out.println(m + "\n");
                int y = InputDate.iYear();
                System.out.println(y + "\n");
                System.out.printf("%d.%d.%d \n", d, m, y);
                day.add(d);
                month.add(m);
                year.add(y);
            }

            int res = day.get(0);
            int resTwo = day.get(1);

            for (int i = res; i < resTwo + 1; i++) {
                list.add(i);
            }

            int ver = day.get(2);
            int verTwo = day.get(3);

            for (int i = ver; i < verTwo + 1; i++) {
                listTwo.add(i);
            }

            Arrays.sort(new ArrayList[]{list});
            Arrays.sort(new ArrayList[]{listTwo});
            ArrayList<Object> result = new ArrayList<>();
            int i = 0;
            int j = 0;
            while (i < list.size() && j < listTwo.size()) {
                if (list.get(i) > listTwo.get(j)) {
                    j++;

                } else if (list.get(i) < listTwo.get(j)) {
                    i++;

                } else {
                    result.add(list.get(i));
                    i++;
                    j++;
                }
            }

            int resN = result.size();

            if (day.get(0) > day.get(1) || day.get(2) > day.get(3) || !Objects.equals(month.get(0), month.get(1)) || !Objects.equals(month.get(2), month.get(3)) || !Objects.equals(month.get(1), month.get(3))) {
                System.out.print(LaboratoryTwo.TextPaint.sANSI_RED + "Ошибка: дата окончания не должна быть меньше чем дата начала , а месяца должны быть одинаковыми \n" + LaboratoryTwo.TextPaint.sANSI_RED);
                DateInput();
            } else {
                if (!Objects.equals(year.get(0), year.get(1)) || !Objects.equals(year.get(2), year.get(3))||!Objects.equals(year.get(1), year.get(3))) {

                    System.out.println("N = 0 - нет результата и даты не пересекается \n");

                } else {
                    BigInteger period = Calculator.factorial(resN);
                    System.out.println("N = " + resN + "\n");
                    System.out.println(period + "\n");
                }

            }

        } catch (Exception e) {
            System.out.print(LaboratoryTwo.TextPaint.sANSI_RED + "Ошибка: введите корректные данные\n" + TextPaint.sANSI_RED);
            DateInput();
        }
    }
}
