package LabaratoryThree.LaboratoryTwo;

import java.util.Scanner;

import static LabaratoryThree.LaboratoryTwo.ValueValidation.*;

public class InputString {

    public static void inputVal() throws Exception {
        System.out.print("Введите значение: ");
        String sValOne = General.sScannerStringCustom();
        System.out.print("Введите значение: ");
        String sValTwo = General.sScannerStringCustom();
        System.out.print(
                TextPaint.sANSI_GREEN +
                        "Проверка по:\n" +
                        "[0] Совпадают ли они посимвольно\n" +
                        "[1] Совпадают ли они посимвольно если привести их к одному регистру, удалить пробелы в начале и в конце, а также их дублирование\n" +
                        "[2] Являются ли одна строка перевёртышем к другой (символы в обратной последовательности)\n" +
                        "[3] Являются ли строки: email'ом   \n " +
                        "[4] Являются ли строки: тел. номером   \n " +
                        "[5] Являются ли строки: IP-адресом  \n " +
                        "\n" +
                        "Выберите пункт:" + TextPaint.sANSI_GREEN
        );
        Scanner in = new Scanner(System.in);
        String valueInput = in.nextLine();
        switch (valueInput) {
            case ("0") -> {
                vStringComparison(sValOne, sValTwo);
            }
            case ("1") -> {
                vSpaceDeletion(sValOne, sValTwo);
            }
            case ("2") -> {
                vPerevertish(sValOne, sValTwo);
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

    }
}}




