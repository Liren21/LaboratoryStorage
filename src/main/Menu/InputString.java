package main.Menu;

import main.General.Task;
import main.General.TextPaint;
import main.General.Validation.ValidationException;
import main.General.Validation.ValidationValue;

import static main.General.PullScanner.sScannerCustom;
import static main.General.Validation.ValidationValue.*;

public class InputString extends Task {
    public InputString() {
        _title = "Строки";
    }

    public void execute() {
        inputVal();
    }

    public static void inputVal() {
        try {
            System.out.print("Введите значение: ");
            String sValOne = sScannerCustom();

            System.out.print("Введите значение: ");
            String sValTwo = sScannerCustom();

            vStringComparison(sValOne, sValTwo);

            vSpaceDeletion(sValOne, sValTwo);
            vReverseSequence(sValOne, sValTwo);

            vEmail(sValOne);
            vEmail(sValTwo);


            vPhoneNumber(sValOne);
            vPhoneNumber(sValTwo);

            vIpAddress(sValOne);
            vIpAddress(sValTwo);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            inputVal();
        }
    }
}




