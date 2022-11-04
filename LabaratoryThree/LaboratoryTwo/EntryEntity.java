package LabaratoryThree.LaboratoryTwo;

import LaboratoryTwo.TextPaint;

import static LabaratoryThree.LaboratoryTwo.General.iScannerCustom;

class EntryEntity {
    int iDay;
    int iMonth;
    int iYear;

    void vDay() {
        try {
            System.out.print(TextPaint.sANSI_BLUE + "День: " + TextPaint.sANSI_BLUE);
            int value = iScannerCustom();
            if (value > 31 || value == 0) {
                System.out.print(TextPaint.sANSI_RED + "Не правильно ввели день\n" + TextPaint.sANSI_RED);
                vDay();
            } else {
                iDay = value;
            }
        }catch (Exception e){
            System.out.print(TextPaint.sANSI_RED + "Не правильно ввели день\n" + TextPaint.sANSI_RED);
            vDay();
        }
    }

    void vMonth() {
        try {
            System.out.print(TextPaint.sANSI_BLUE + "Месяц: " + TextPaint.sANSI_BLUE);
            int value = iScannerCustom();
            if (value > 12 || value == 0) {
                System.out.print(TextPaint.sANSI_RED + "Не правильно ввели месяц\n" + TextPaint.sANSI_RED);
                vMonth();
            } else {
                iMonth = value;
            }
        }catch (Exception e){
            System.out.print(TextPaint.sANSI_RED + "Не правильно ввели месяц\n" + TextPaint.sANSI_RED);
            vMonth();
        }
    }

    void vYear() {
        try {
            System.out.print(TextPaint.sANSI_BLUE + "Год: " + TextPaint.sANSI_BLUE);
            int value = iScannerCustom();
            if (value < 2022) {
                System.out.print(TextPaint.sANSI_RED + "Не правильно ввели год\n" + TextPaint.sANSI_RED);
                vYear();
            } else {
                iYear = value;
            }
        }catch (Exception e){
            System.out.print(TextPaint.sANSI_RED + "Не правильно ввели год\n" + TextPaint.sANSI_RED);
            vYear();
        }
    }
}
