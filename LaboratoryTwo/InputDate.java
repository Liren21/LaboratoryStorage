package LaboratoryTwo;

import java.util.Scanner;

public class InputDate {
    public static int iYear() {
        EntryEntity state = new EntryEntity();
        state.vYear();
        return state.iYear;
    }
    public static int iMonth() {
        EntryEntity state = new EntryEntity();
        state.vMouth();
        return state.iMouth;
    }
    public static int iDay() {
        EntryEntity state = new EntryEntity();
        state.vDay();
        return state.iDay;
    }
}
class EntryEntity {
    int iDay;
    int iMouth;
    int iYear;
    void vDay() {
        Scanner in = new Scanner(System.in);
        System.out.print(TextPaint.sANSI_BLUE + "День: " + TextPaint.sANSI_BLUE);
        int value = in.nextInt();
        if (value > 31) {
            System.out.print(TextPaint.sANSI_RED + "Не правильно ввели день\n" + TextPaint.sANSI_RED);
            vDay();
        } else {
            iDay = value;
        }
    }
    void vMouth() {
        Scanner in = new Scanner(System.in);
        System.out.print(TextPaint.sANSI_BLUE + "Месяц: " + TextPaint.sANSI_BLUE);
        int value = in.nextInt();
        if (value > 12) {
            System.out.print(TextPaint.sANSI_RED + "Не правильно ввели месяц\n" + TextPaint.sANSI_RED);
            vMouth();
        } else {
            iMouth = value;
        }
    }
    void vYear() {
        Scanner in = new Scanner(System.in);
        System.out.print(TextPaint.sANSI_BLUE + "Год: " + TextPaint.sANSI_BLUE);
        int value = in.nextInt();
        if (value < 2022) {
            System.out.print(TextPaint.sANSI_RED + "Не правильно ввели год\n" + TextPaint.sANSI_RED);
            vYear();
        } else {
            iYear = value;
        }
    }
}

