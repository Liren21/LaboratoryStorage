package LaboratoryTwo;

import java.util.Scanner;


public class InputDate {

    public static int iYear() {
        Scanner in = new Scanner(System.in);
        System.out.print(TextPaint.sANSI_BLUE + "год: " + TextPaint.sANSI_BLUE);
        return in.nextInt();
    }

    public static int iMonth() {
        Scanner in = new Scanner(System.in);
        System.out.print(TextPaint.sANSI_BLUE + "Месяц: " + TextPaint.sANSI_BLUE);
        return in.nextInt();
    }

    public static int iDay() {
        Scanner in = new Scanner(System.in);
        int val = in.nextInt();

        System.out.print(TextPaint.sANSI_BLUE + "День: " + TextPaint.sANSI_BLUE);
        return in.nextInt();
    }

    public static int iValidDay(int val) {

        try {
            iDay();

        } catch (Exception e) {
            System.out.print("Жопа");
        }
        return val;
    }

}
