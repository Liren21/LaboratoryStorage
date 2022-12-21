import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValueValidation {
    public static void vStringComparison(String strOne, String strTwo) throws ValidationException {

        try {
            if (strOne.equalsIgnoreCase(strTwo)) {
                System.out.println(TextPaint.sANSI_BLUE + "Строки равны " + TextPaint.sANSI_BLUE);

            }else {
                CustomValidationException.vExpNoValid(0);
            }
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void vSpaceDeletion(String sValOne, String sValTwo) throws ValidationException {

        String sResOne = sValOne.toLowerCase();
        String sResTwo = sValTwo.toLowerCase();
        String sDelDupOne = sResOne.replaceAll("\\s+", " ");
        String sDelDupTwo = sResTwo.replaceAll("\\s+", " ");
        String sDelSpaceOne = sDelDupOne.trim();
        String sDelSpaceTwo = sDelDupTwo.trim();
        vStringComparison(sDelSpaceOne, sDelSpaceTwo);

    }

    public static void vReverseSequence(String strOne, String strTwo) throws ValidationException {
        try {
            int stringLength = strTwo.length();
            String result = "";
            for (int i = 0; i < stringLength; i++) {
                result = strTwo.charAt(i) + result;
            }
            if (result.equals(strOne)) {
                System.out.println(TextPaint.sANSI_BLUE + "Строки равны\n" + TextPaint.sANSI_BLUE);
            }else {
                CustomValidationException.vExpNoValid(1);
            }
        } catch (ValidationException e) {
            System.out.println(e.getMessage());


        }
    }


    public static void vEmail(String valOne) throws ValidationException {

        try {
            Pattern pattern = Pattern.compile("^((\\w|[-+])+(\\.[\\w-]+)*@[\\w-]+((\\.[\\d\\p{Alpha}]+)*(\\.\\p{Alpha}{2,})*)*)$");
            Matcher matcher = pattern.matcher(valOne);

            if (matcher.find()) {
                System.out.print("Проверку прошел " +
                        valOne.substring(matcher.start(), matcher.end()) + " \n");
            } else {
                CustomValidationException.vExpNoValid(2);
            }
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void vPhoneNumber(String valOne) throws ValidationException {

        try {
            Pattern pattern = Pattern.compile("^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$");
            Matcher matcher = pattern.matcher(valOne);

            if (matcher.find()) {
                System.out.print(TextPaint.sANSI_BLUE + "Проверку прошел " +
                        valOne.substring(matcher.start(), matcher.end()) + " \n" + TextPaint.sANSI_BLUE);
            }else {
                CustomValidationException.vExpNoValid(3);
            }
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void vIpAddress(String valOne) throws ValidationException {

        try {
            Pattern pattern = Pattern.compile("(\\b25[0-5]|\\b2[0-4][0-9]|\\b[01]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}");
            Matcher matcher = pattern.matcher(valOne);

            if (matcher.find()) {
                System.out.print(TextPaint.sANSI_BLUE + "Проверку прошел  " +
                        valOne.substring(matcher.start(), matcher.end()) + " \n" + TextPaint.sANSI_BLUE);
            } else {
                CustomValidationException.vExpNoValid(4);
            }
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }

    }
}
