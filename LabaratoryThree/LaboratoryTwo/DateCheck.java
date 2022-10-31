package LabaratoryThree.LaboratoryTwo;

public class DateCheck {
    public static int CheckDate(int iInputNumber, int status) {
        try {
            switch (status) {
                case (0) -> {
                    if (iInputNumber > 31) {
                        System.out.print(TextPaint.sANSI_RED + "Ошибка: День не может привышать больше чем 31\n" + TextPaint.sANSI_RED);
                        RecursionDate.DateInput();
                    }
                }
                case (1) -> {
                    if (iInputNumber > 12) {
                        System.out.print(TextPaint.sANSI_RED + "Ошибка: Месяц не может привышать больше чем 12\n" + TextPaint.sANSI_RED);
                        RecursionDate.DateInput();
                    }
                }
                case (2) -> {
                    if (iInputNumber < 2022) {
                        System.out.print(TextPaint.sANSI_RED + "Ошибка: Год не может быть меньше чем 2022\n" + TextPaint.sANSI_RED);
                        RecursionDate.DateInput();
                    }
                }
            }

        } catch (Exception e) {
            System.out.print(TextPaint.sANSI_RED + "Ошибка: Введите число\n" + TextPaint.sANSI_RED);
        }

        return iInputNumber;
    }

    public static int iSegmentValue(int iFirstDate, int iFirstMonth, int iFirstYears) {
        try {
            if (iFirstMonth == 2){
                if (iFirstDate != 28) {
                    System.out.print("в месяце только 28 дней");
                } else {
                    System.out.print("в месяце только 28 дней");
                }
            }
        }catch (Exception e){
            System.out.print("Ошибка: жопаМуровья");
        }
        return 0;
    }
}
