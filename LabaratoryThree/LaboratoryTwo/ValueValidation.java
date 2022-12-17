package LabaratoryThree.LaboratoryTwo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValueValidation {
    public static void vStringComparison(String strOne, String strTwo)  {
        try {
            if (strOne.equalsIgnoreCase(strTwo)) {
                System.out.println(TextPaint.sANSI_BLUE + "Строки равны " + TextPaint.sANSI_BLUE);
            } else {
                CustomException.vExpNoValid(0);
            }
        } catch (Exception e) {
            System.out.println(TextPaint.sANSI_RED + "Message: Строки не совпадают по символьно\n" + TextPaint.sANSI_RED);
        }
    }

    public static void vSpaceDeletion(String sValOne, String sValTwo) throws Exception {

        String sResOne = sValOne.toLowerCase();
        String sResTwo = sValTwo.toLowerCase();
        String sDelDupOne = sResOne.replaceAll("\\s+", " ");
        String sDelDupTwo = sResTwo.replaceAll("\\s+", " ");
        String sDelSpaceOne = sDelDupOne.trim();
        String sDelSpaceTwo = sDelDupTwo.trim();
        vStringComparison(sDelSpaceOne, sDelSpaceTwo);

    }

    public static void vReverseSequence(String strOne, String strTwo) throws Exception {
        try {
            int stringLength = strTwo.length();
            String result = "";
            for (int i = 0; i < stringLength; i++) {
                result = strTwo.charAt(i) + result;
            }
            if (result.equals(strOne)) {
                System.out.println(TextPaint.sANSI_BLUE + "Строки равны\n" + TextPaint.sANSI_BLUE);
            } else {
                CustomException.vExpNoValid(2);
            }
        } catch (Exception e) {
            System.out.println(TextPaint.sANSI_RED + "Message: Строка не является перевертышем\n" + TextPaint.sANSI_RED);
        }
    }


    public static void vEmail(String valOne) throws Exception {

        try {
            Pattern pattern = Pattern.compile("^((\\w|[-+])+(\\.[\\w-]+)*@[\\w-]+((\\.[\\d\\p{Alpha}]+)*(\\.\\p{Alpha}{2,})*)*)$");
            Matcher matcher = pattern.matcher(valOne);

            if (matcher.find()) {
                System.out.print("Проверку прошел " +
                        valOne.substring(matcher.start(), matcher.end()) + " \n");
            } else {
                CustomException.vExpNoValid(3);
            }
        } catch (Exception e) {
            System.out.println(TextPaint.sANSI_RED + "Message: Не похож на Email\n" + TextPaint.sANSI_RED);

        }

    }

    public static void vPhoneNumber(String valOne) throws Exception {

        try {
            Pattern pattern = Pattern.compile("^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$");
            Matcher matcher = pattern.matcher(valOne);

            if (matcher.find()) {
                System.out.print(TextPaint.sANSI_BLUE + "Проверку прошел " +
                        valOne.substring(matcher.start(), matcher.end()) + " \n" + TextPaint.sANSI_BLUE);
            } else {
                CustomException.vExpNoValid(4);            }
        } catch (Exception e) {
            System.out.println(TextPaint.sANSI_RED + "Message: Не похож на номера телефона\n" + TextPaint.sANSI_RED);

        }

    }

    public static void vIpAddress(String valOne) throws Exception {

        try {
            Pattern pattern = Pattern.compile("(\\b25[0-5]|\\b2[0-4][0-9]|\\b[01]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}");
            Matcher matcher = pattern.matcher(valOne);

            if (matcher.find()) {
                System.out.print(TextPaint.sANSI_BLUE + "Проверку прошел  " +
                        valOne.substring(matcher.start(), matcher.end()) + " \n" + TextPaint.sANSI_BLUE);
            } else {
                CustomException.vExpNoValid(5);
            }
        } catch (Exception e) {
            System.out.println(TextPaint.sANSI_RED + "Message: Не похож на ip address(ipv4)\n" + TextPaint.sANSI_RED);

        }

    }
}
