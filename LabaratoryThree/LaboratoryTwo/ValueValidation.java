package LabaratoryThree.LaboratoryTwo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValueValidation {
    private static final String EMAIL_REGEX = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
    public static void vStringComparison(String strOne, String strTwo) {
        // возвращается true, ведь обе строки равны без учёта регистра
        if (strOne.equalsIgnoreCase(strTwo)) {
            System.out.println("Строки равны  без учета регистра");
        } else {
            System.out.println("Строки не равны без учета регистра");
        }
        // возвращается false, т. к. учитывается регистр символов
        if (strOne.equals(strTwo)) {
            System.out.println("Строки равны  c учетом регистра");
        } else {
            System.out.println("Строки не равны  c учетом регистра");
        }
    }

    public static void vSpaceDeletion(String strOne) {

        strOne = strOne.replace(',', '.');
        System.out.println(strOne);
    }

    public static void vPerevertish(String strOne, String strTwo) {

        int stringLength = strTwo.length();
        String result = "";
        for (int i = 0; i < stringLength; i++) {
            result = strTwo.charAt(i) + result;
        }
        if (result.equals(strOne)) {
            System.out.println("Они равны");
        } else {
            System.out.println("Они не равны");
        }
    }


    public static boolean emailValidator(String email)
    {
        if (email == null) {
            return false;
        }

        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }

    public static void vEmail(String valOne)
    {
        String email = valOne;

        // Проверка адреса электронной почты
        if (emailValidator(email)) {
            System.out.println("The email address " + email + " is valid");
        }
        else {
            System.out.println("The email address " + email + " is invalid");
        }
    }
}
