package LabaratoryThree.LaboratoryTwo;

import java.util.Scanner;

public class General {
    public static int iScannerCustom() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static String sScannerCustom() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

//    public static String vCheckingDateCorrectness(String valOne) {
//
//        try {
//            Pattern pattern = Pattern.compile("(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})");
//            Matcher matcher = pattern.matcher(valOne);
//
//            if (matcher.find()) {
//               return valOne;
//            } else {
//                CustomException.vExpNoValid(3);
//            }
//        } catch (Exception e) {
//            System.out.println(TextPaint.sANSI_RED + "Ошибка, вы ввели не дату, начните ввод сначала\n" + TextPaint.sANSI_RED);
//            RecursionDate.DateInput();
//
//        }
//
//        return valOne;
//    }


}
