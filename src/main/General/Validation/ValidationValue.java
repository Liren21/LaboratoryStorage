package main.General.Validation;

import main.General.TextPaint;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationValue extends ValidationCustomException {
    public static String vStringComparison(String strOne, String strTwo) throws ValidationException {
        if (strOne.equalsIgnoreCase(strTwo)) {
            System.out.println(TextPaint.sANSI_BLUE + "Строки равны " + TextPaint.sANSI_BLUE);
        } else {
            vExpNoValid(0);
        }
        return "true";
    }

    public static String vSpaceDeletion(String sValOne, String sValTwo) throws ValidationException {

        String sResOne = sValOne.toLowerCase();
        String sResTwo = sValTwo.toLowerCase();
        String sDelDupOne = sResOne.replaceAll("\\s+", " ");
        String sDelDupTwo = sResTwo.replaceAll("\\s+", " ");
        String sDelSpaceOne = sDelDupOne.trim();
        String sDelSpaceTwo = sDelDupTwo.trim();
        vStringComparison(sDelSpaceOne, sDelSpaceTwo);
        return "true";

    }

    public static String vReverseSequence(String strOne, String strTwo) throws ValidationException {
        int stringLength = strTwo.length();
        String result = "";
        for (int i = 0; i < stringLength; i++) {
            result = strTwo.charAt(i) + result;
        }
        if (result.equals(strOne)) {
            System.out.println(TextPaint.sANSI_BLUE + "Строки равны\n" + TextPaint.sANSI_BLUE);
        } else {
            vExpNoValid(2);
        }
        return "true";
    }


    public static String vEmail(String valOne) throws ValidationException {


            Pattern pattern = Pattern.compile("[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+");
            Matcher matcher = pattern.matcher(valOne);

            if (matcher.find()) {
                System.out.print("Проверку прошел " +
                        valOne.substring(matcher.start(), matcher.end()) + " \n");
            } else {
                vExpNoValid(3);
            }

        return "true";

    }

    public static String vPhoneNumber(String valOne) throws ValidationException {
        Pattern pattern = Pattern.compile("^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$");
        Matcher matcher = pattern.matcher(valOne);
        if (matcher.find()) {
            System.out.print(TextPaint.sANSI_BLUE + "Проверку прошел " +
                    valOne.substring(matcher.start(), matcher.end()) + " \n" + TextPaint.sANSI_BLUE);
        } else {
            vExpNoValid(4);
        }
        return "true";
    }

    public static String vIpAddress(String valOne) throws ValidationException {

        Pattern pattern = Pattern.compile("(\\b25[0-5]|\\b2[0-4][0-9]|\\b[01]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}");
        Matcher matcher = pattern.matcher(valOne);

        if (matcher.find()) {
            System.out.print(TextPaint.sANSI_BLUE + "Проверку прошел  " +
                    valOne.substring(matcher.start(), matcher.end()) + " \n" + TextPaint.sANSI_BLUE);
        } else {
            vExpNoValid(5);
        }
        return "true";
    }

    public static int vValZero(int valOne, String val) throws ValidationException {
        switch (val) {
            case "x":
                if (valOne == 0) {
                    vExpNoValid(6);
                }
                break;
            case "y":
                if (valOne < 0) {
                    vExpNoValid(7);
                }
                break;
        }
        return valOne;


    }
}
