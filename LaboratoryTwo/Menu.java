package LaboratoryTwo;

import java.util.Scanner;

public class Menu {
    public static void vMenu() {
        System.out.print(
                TextPaint.sANSI_GREEN + "\n--------------------------------------------------------------------\n\n" +
                        "Приветствую тебя пользователь, программа обладает следующим функционалом:\n" +
                        "[0] Выход\n" +
                        "[1] Вывод в консоль 'Hello World!'\n" +
                        "[2] Калькулятор по формуле\n" +
                        "[3] Дата рекурсии   \n " +
                        "\n--------------------------------------------------------------------\n" +
                        "\n" +
                        "Выберите пункт:" + TextPaint.sANSI_GREEN
        );
        Scanner in = new Scanner(System.in);
        String valueInput = in.nextLine();


        switch (valueInput) {
            case ("0") -> {
                System.out.print("Вы выбрали: Выход из программы.\nДо свидания, надеемся, что вы еще вернетесь.\n");
                System.exit(0);
            }
            case ("1") -> {
                HelloWorld.vWithdrawalHelloWord();
                vMenu();
            }
            case ("2") -> {
                Calculator.vCalc();
                vMenu();
            }
            case ("3") -> {
                RecursionDate.DateInput();
                vMenu();
            }
            default -> {
                System.out.print(TextPaint.sANSI_RED + "Введите число из представленного меню" + TextPaint.sANSI_RED);
                vMenu();
            }
        }
    }
}
