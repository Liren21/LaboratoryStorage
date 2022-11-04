package LabaratoryThree.LaboratoryTwo;

import static LabaratoryThree.LaboratoryTwo.ValueValidation.*;

public class InputString {

    public static void inputVal() throws Exception {
        System.out.print("Введите значение: ");
        String sValOne = General.sScannerCustom();
        System.out.print("Введите значение: ");
        String sValTwo = General.sScannerCustom();
        System.out.print(
                TextPaint.sANSI_GREEN +
                        "Проверка по:\n" +
                        "[0] Совпадают ли они посимвольно\n" +
                        "[1] Совпадают ли они посимвольно если привести их к одному регистру, удалить пробелы в начале и в конце, а также их дублирование\n" +
                        "[2] Являются ли одна строка перевёртышем к другой (символы в обратной последовательности)\n" +
                        "[3] Являются ли строки: email'ом   \n" +
                        "[4] Являются ли строки: тел. номером   \n" +
                        "[5] Являются ли строки: IP-адресом  \n" +
                        "[6] Вывести все результаты  \n" +
                        "\n" +
                        "Выберите пункт:" + TextPaint.sANSI_GREEN
        );

        String valueInput = General.sScannerCustom();

        switch (valueInput) {
            case ("0") -> {
                vStringComparison(sValOne, sValTwo);
            }
            case ("1") -> {
                vSpaceDeletion(sValOne, sValTwo);
            }
            case ("2") -> {
                vReverseSequence(sValOne, sValTwo);
            }
            case ("3") -> {
                vEmail(sValOne);
                vEmail(sValTwo);
            }
            case ("4") -> {
                vPhoneNumber(sValOne);
                vPhoneNumber(sValTwo);
            }
            case ("5") -> {
                vIpAddress(sValOne);
                vIpAddress(sValTwo);
            }
            case ("6") -> {
                vStringComparison(sValOne, sValTwo);
                vSpaceDeletion(sValOne, sValTwo);
                vReverseSequence(sValOne, sValTwo);
                vEmail(sValOne);
                vEmail(sValTwo);
                vPhoneNumber(sValOne);
                vPhoneNumber(sValTwo);
                vIpAddress(sValOne);
                vIpAddress(sValTwo);
            }

    }
}}




