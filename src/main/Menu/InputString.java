package main.Menu;
import main.General.TextPaint;
import main.General.Validation.ValidationValue;
import static main.General.PullScanner.sScannerCustom;

public class InputString extends ValidationValue {

    public static void inputVal()  {
        System.out.print("Введите значение: ");
        String sValOne = sScannerCustom();
        System.out.print("Введите значение: ");
        String sValTwo = sScannerCustom();
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

        String valueInput = sScannerCustom();
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




