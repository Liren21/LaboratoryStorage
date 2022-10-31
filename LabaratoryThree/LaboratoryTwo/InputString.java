package LabaratoryThree.LaboratoryTwo;

import java.util.Scanner;

public class InputString {

    public static void inputVal() {
        valid main = new valid();
        String str1 = main.iInputStr();
        String str2 = main.iInputStr();
        ValueValidation.vStringComparison(str1,str2);
//        ValueValidation.vSpaceDeletion(str1);
        ValueValidation.vPerevertish(str1,str2);
        ValueValidation.vEmail(str1);

    }
}

class valid {
    String iInputStr() {
        Scanner in = new Scanner(System.in);
        System.out.print(TextPaint.sANSI_BLUE + "Введите строку: " + TextPaint.sANSI_BLUE);
        return in.nextLine();
    }

}


