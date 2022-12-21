public class CustomValidationException {


    public static void vExpNoValid(int val) throws ValidationException {
        switch (val) {
            case (0) -> {
                throw new ValidationException(TextPaint.sANSI_RED + "Строки не равны без учета регистра");
            }
            case (1) -> {
                throw new ValidationException(TextPaint.sANSI_RED + "Строки не равны c учета регистра");
            }
            case (2) -> {
                throw new ValidationException(TextPaint.sANSI_RED + "Строка не является перевертышем");
            }
            case (3) -> {
                throw new ValidationException(TextPaint.sANSI_RED + "Проверку не прошел  Это не похоже на адрес электронной почты  \n");
            }
            case (4) -> {
                throw new ValidationException(TextPaint.sANSI_RED + "Проверку не прошел  Это не похоже на номера телефона  \n");
            }
            case (5) -> {
                throw new ValidationException(TextPaint.sANSI_RED + "Проверку не прошел  Это не похоже на ip address(ipv4)  \n");
            }
        }

    }

}
