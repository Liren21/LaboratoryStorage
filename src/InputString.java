

public class InputString {

    public static void inputVal() throws Exception {
        System.out.print("Введите значение: ");
        String sValOne = General.sScannerCustom();
        System.out.print("Введите значение: ");
        String sValTwo = General.sScannerCustom();
        ValueValidation.vStringComparison(sValOne, sValTwo);
        ValueValidation.vSpaceDeletion(sValOne, sValTwo);
        ValueValidation.vReverseSequence(sValOne, sValTwo);

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
                ValueValidation.vEmail(sValOne);
                ValueValidation.vEmail(sValTwo);
            }
            case ("1") -> {
                ValueValidation.vPhoneNumber(sValOne);
                ValueValidation.vPhoneNumber(sValTwo);
            }
            case ("2") -> {
                ValueValidation.vIpAddress(sValOne);
                ValueValidation.vIpAddress(sValTwo);
            }


        }
    }
}




