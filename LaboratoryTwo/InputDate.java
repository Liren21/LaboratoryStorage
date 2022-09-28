package LaboratoryTwo;

import java.util.Scanner;

public class InputDate {

    public static int Year() {
        Scanner in = new Scanner(System.in);
        System.out.print(TextPaint.sANSI_BLUE + "год: " + TextPaint.sANSI_BLUE);
        return in.nextInt();
    }

    public static int Month() {
        Scanner in = new Scanner(System.in);
        System.out.print(TextPaint.sANSI_BLUE + "Месяц: " + TextPaint.sANSI_BLUE);
        return in.nextInt();
    }

    public static int Day() {
        Scanner in = new Scanner(System.in);
        System.out.print(TextPaint.sANSI_BLUE + "День: " + TextPaint.sANSI_BLUE);
        return in.nextInt();
    }
}
