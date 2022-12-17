package LabaratoryThree.LaboratoryTwo;

import static LabaratoryThree.LaboratoryTwo.ValueValidation.*;

public class InputString {

    public static void inputVal() throws Exception {
        System.out.print("Введите значение: ");
        String sValOne = General.sScannerCustom();
        System.out.print("Введите значение: ");
        String sValTwo = General.sScannerCustom();
        vStringComparison(sValOne, sValTwo);
        vSpaceDeletion(sValOne, sValTwo);
        vReverseSequence(sValOne, sValTwo);

        System.out.print(
                TextPaint.sANSI_GREEN +
                        "Проверка по:\n" +
                        "[0] Являются ли строки: email'ом   \n" +
                        "[1] Являются ли строки: тел. номером   \n" +
                        "[2] Являются ли строки: IP-адресом  \n" +
                        "\n" +
                        "Выберите пункт:" + TextPaint.sANSI_GREEN
        );

        String valueInput = General.sScannerCustom();
        switch (valueInput) {
            case ("0") -> {
                vEmail(sValOne);
                vEmail(sValTwo);
            }
            case ("1") -> {
                vPhoneNumber(sValOne);
                vPhoneNumber(sValTwo);
            }
            case ("2") -> {
                vIpAddress(sValOne);
                vIpAddress(sValTwo);
            }


        }
    }
}




