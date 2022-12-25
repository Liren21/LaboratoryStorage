package main.Menu;

import main.General.TextPaint;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import static main.General.Estimated.EstimatedCalc.factorial;
import static main.General.PullScanner.sScannerCustom;


public class RecursionDate {
    public static void DateInput() {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        format.setLenient(false);
        ArrayList<String> storageDate = new ArrayList<>();
        ArrayList<String> firstSegment = new ArrayList<>();
        ArrayList<String> secondSegment = new ArrayList<>();

        try {

            for (int i = 1; i < 5; i++) {
                System.out.println(TextPaint.sANSI_BLUE + "Введите дату для " + i + " точки в отрезке: ");
                String date = sScannerCustom();
                format.parse(date);
                System.out.println("Ваша дата " + date + " \n");
                storageDate.add(date);
            }

            Date date2 = format.parse(storageDate.get(0));
            Date date3 = format.parse(storageDate.get(1));
            Date date4 = format.parse(storageDate.get(2));
            Date date5 = format.parse(storageDate.get(3));

            if (date3.getTime() < date2.getTime() || date5.getTime() < date4.getTime()) {
                System.out.print(TextPaint.sANSI_RED + "Дата окончания меньше чем дата начала\nПовторите ввод\n");
                DateInput();
            } else {
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

                BigInteger period = factorial(iSizeSortedArray);
                System.out.println("N = " + iSizeSortedArray + "\n");
                System.out.println(period + "\n");
            }


        } catch (Exception e) {
            System.out.print(TextPaint.sANSI_RED + "Ошибка: введите корректные данные\n");
            DateInput();
        }
    }
}
