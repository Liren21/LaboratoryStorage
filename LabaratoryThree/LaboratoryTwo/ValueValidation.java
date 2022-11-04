package LabaratoryThree.LaboratoryTwo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValueValidation {

    public static void vStringComparison(String strOne, String strTwo) throws Exception {
        // возвращается true, ведь обе строки равны без учёта регистра
        if (strOne.equalsIgnoreCase(strTwo)) {
            System.out.println(TextPaint.sANSI_BLUE + "Строки равны  без учета регистра" + TextPaint.sANSI_BLUE);
        } else {
            throw new Exception("Строки не равны без учета регистра");
        }
        // возвращается false, т. к. учитывается регистр символов
        if (strOne.equals(strTwo)) {
            System.out.println("Строки равны  c учетом регистра");
        } else {
            throw new Exception("Строки не равны c учета регистра");
        }
    }

    public static void vSpaceDeletion(String sValOne, String sValTwo) {
        String sResOne = sValOne.toLowerCase();
        String sResTwo = sValTwo.toLowerCase();
        String sDelDupOne = sResOne.replaceAll("\\s+", " ");
        String sDelDupTwo = sResTwo.replaceAll("\\s+", " ");
        System.out.println(sDelDupOne.trim());
        System.out.println(sDelDupTwo.trim());

    }

    public static void vPerevertish(String strOne, String strTwo) throws Exception {

        int stringLength = strTwo.length();
        String result = "";
        for (int i = 0; i < stringLength; i++) {
            result = strTwo.charAt(i) + result;
        }
        if (result.equals(strOne)) {
            System.out.println(TextPaint.sANSI_BLUE+"Строки равны\n"+TextPaint.sANSI_BLUE);
        } else {
            throw new Exception("Строки не равны");
        }
    }


    public static void vEmail(String valOne) throws Exception {

        Pattern pattern = Pattern.compile("^((\\w|[-+])+(\\.[\\w-]+)*@[\\w-]+((\\.[\\d\\p{Alpha}]+)*(\\.\\p{Alpha}{2,})*)*)$");
        Matcher matcher = pattern.matcher(valOne);

        if (matcher.find()) {
            System.out.print("Проверку прошел " +
                    valOne.substring(matcher.start(), matcher.end()) + " \n");
        } else {
            throw new Exception("Проверку не прошел " + TextPaint.sANSI_GREEN + valOne + TextPaint.sANSI_GREEN + TextPaint.sANSI_RED + " Это не похоже на адрес электронной почты  \n" + TextPaint.sANSI_RED);
        }

    }

    public static void vPhoneNumber(String valOne) throws Exception {

        Pattern pattern = Pattern.compile("^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$");
        Matcher matcher = pattern.matcher(valOne);

        if (matcher.find()) {
            System.out.print(TextPaint.sANSI_BLUE + "Проверку прошел " +
                    valOne.substring(matcher.start(), matcher.end()) + " \n" + TextPaint.sANSI_BLUE);
        } else {
            throw new Exception("Проверку не прошел " + TextPaint.sANSI_GREEN + valOne + TextPaint.sANSI_GREEN + TextPaint.sANSI_RED + " Это не похоже на номера телефона  \n" + TextPaint.sANSI_RED);
        }

    }

    public static void vIpAddress(String valOne) throws Exception {

        Pattern pattern = Pattern.compile("(\\b25[0-5]|\\b2[0-4][0-9]|\\b[01]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}");
        Matcher matcher = pattern.matcher(valOne);

        if (matcher.find()) {
            System.out.print(TextPaint.sANSI_BLUE + "Проверку прошел  " +
                    valOne.substring(matcher.start(), matcher.end()) + " \n" + TextPaint.sANSI_BLUE);
        } else
            throw new Exception("Проверку не прошел " + TextPaint.sANSI_GREEN + valOne + TextPaint.sANSI_GREEN + TextPaint.sANSI_RED + " Это не похоже на ip address(ipv4)  \n" + TextPaint.sANSI_RED);
        {
            throw new Exception("Проверку не прошел " + TextPaint.sANSI_GREEN + valOne + TextPaint.sANSI_GREEN + TextPaint.sANSI_RED + " Это не похоже на ip address(ipv4)  \n" + TextPaint.sANSI_RED);
        }

    }
}
