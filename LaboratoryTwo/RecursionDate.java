package LaboratoryTwo;

import java.time.LocalDate;
import java.util.ArrayList;


public class RecursionDate {

    public static void DateInput() {
        //Дико извиняюсь за эту портянку( мне слишком лень было делать нормально( Для нормальной реализации этого кода лучше использовать метод map))


        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> firstSegment = new ArrayList<>();
        try {
            for (int i = 0; i < 4; i++) {
                int d = InputDate.Day();
                int m = InputDate.Month();
                int y = InputDate.Year();
                LocalDate date = LocalDate.of(y, m, d);
                System.out.println(date + "\n");
                al.add(d);
            }
//            for (int i = al.get(0); i < al.get(3); i++) {
//                int iNum = al.get(0);
//                firstSegment.add( iNum );
//            }
            System.out.println(al.get(3) - al.get(0) + 1 + "\n");


        } catch (Exception e) {
            System.out.print(TextPaint.sANSI_RED + "Ошибка: Жопа\n" + TextPaint.sANSI_RED);
            DateInput();
        }

    }

}
