package main.General.Validation;

import main.General.TextPaint;

public class ValidationCustomException {


    public static void vExpNoValid(int val) throws ValidationException {
        switch (val) {
            case (0) -> {
                throw new ValidationException(TextPaint.sANSI_RED + "Строки не равны без учета регистра"+TextPaint.sANSI_RED);
            }
            case (1) -> {
                throw new ValidationException(TextPaint.sANSI_RED + "Строки не равны c учета регистра"+TextPaint.sANSI_RED);
            }
            case (2) -> {
                throw new ValidationException(TextPaint.sANSI_RED + "Строка не является перевертышем"+TextPaint.sANSI_RED);
            }
            case (3) -> {
                throw new ValidationException(TextPaint.sANSI_RED + "Проверку не прошел  Это не похоже на адрес электронной почты  \n"+TextPaint.sANSI_RED);
            }
            case (4) -> {
                throw new ValidationException(TextPaint.sANSI_RED + "Проверку не прошел  Это не похоже на номера телефона  \n"+TextPaint.sANSI_RED);
            }
            case (5) -> {
                throw new ValidationException(TextPaint.sANSI_RED + "Проверку не прошел  Это не похоже на ip address(ipv4)  \n"+TextPaint.sANSI_RED);
            }
            case (6) -> {
                throw new ValidationException(TextPaint.sANSI_RED + "Чисто Х не может равно 0  \n"+TextPaint.sANSI_RED);
            }
            case (7) -> {
                throw new ValidationException(TextPaint.sANSI_RED + "Число Y не может быть больше 0  \n"+TextPaint.sANSI_RED);
            }
        }

    }

}
