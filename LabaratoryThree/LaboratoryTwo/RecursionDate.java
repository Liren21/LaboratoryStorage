package LabaratoryThree.LaboratoryTwo;

import LaboratoryTwo.TextPaint;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class RecursionDate {
    public static void DateInput() {
        ArrayList<String> storageDate = new ArrayList<>();
        ArrayList<String> firstSegment = new ArrayList<>();
        ArrayList<String> secondSegment = new ArrayList<>();


        try {

            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            for (int i = 1; i < 5; i++) {
                System.out.println(LabaratoryThree.LaboratoryTwo.TextPaint.sANSI_BLUE + "Введите дату для " + i + " точки в отрезке: ");
                String date = General.sScannerCustom();
                System.out.println("Ваша дата " + date + " \n");
                storageDate.add(date);
            }
            Date date2 = format.parse(storageDate.get(0));
            Date date3 = format.parse(storageDate.get(1));
            Date date4 = format.parse(storageDate.get(2));
            Date date5 = format.parse(storageDate.get(3));
            long milliseconds = date3.getTime() - date2.getTime();
            long millisecondsOne = date5.getTime() - date4.getTime();
            int days = (int) (milliseconds / (24 * 60 * 60 * 1000));
            int daysOne = (int) (millisecondsOne / (24 * 60 * 60 * 1000));

            for (int i = 0; i < days + 1; i++) {
                Calendar calendar = Calendar.getInstance();
                String s = storageDate.get(0);
                calendar.setTime(format.parse(s));
                calendar.add(Calendar.DATE, i);
                s = format.format(calendar.getTime());
                firstSegment.add(s);
            }

            for (int i = 0; i < daysOne + 1; i++) {
                Calendar calendar = Calendar.getInstance();
                String s = storageDate.get(2);
                calendar.setTime(format.parse(s));
                calendar.add(Calendar.DATE, i);
                s = format.format(calendar.getTime());
                secondSegment.add(s);
            }

            firstSegment.retainAll(secondSegment);

            int iSizeSortedArray = firstSegment.size();

            BigInteger period = Calculator.factorial(iSizeSortedArray);
            System.out.println("N = " + iSizeSortedArray + "\n");
            System.out.println(period + "\n");


        } catch (Exception e) {
            System.out.print(LaboratoryTwo.TextPaint.sANSI_RED + "Ошибка: введите корректные данные\n" + TextPaint.sANSI_RED);
            DateInput();
        }
    }
}
