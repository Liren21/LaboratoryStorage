import java.text.DecimalFormat;
import java.util.Scanner;

public class LaboratoryWorkTwo {


    public static final String sANSI_RED = "\u001B[31m";
    public static final String sANSI_GREEN = "\u001B[32m";
    public static final String sANSI_BLUE = "\u001B[34m";
    public static final String sANSI_PURPLE = "\u001B[35m";

    public static void vMenu() {
        System.out.print(
                sANSI_GREEN + "\n--------------------------------------------------------------------\n\n" +
                        "Приветствую тебя пользователь, программа обладает следующим функционалом:\n" +
                        "[0] Выход\n" +
                        "[1] Вывод в консоль 'Hello World!'\n" +
                        "[2] Калькулятор по формуле\n" +
                        "[3] Дата рекурсии   \n " +
                        "\n--------------------------------------------------------------------\n" +
                        "\n" +
                        "Выберите пункт:" + sANSI_GREEN
        );
        Scanner in = new Scanner(System.in);
        String valueInput = in.nextLine();

        switch (valueInput) {
            case ("0") -> vExitProgram();
            case ("1") -> {
                vHelloWorld();
                vMenu();
            }
            case ("2") -> {
                vCalc();
                vMenu();
            }
            case ("3") -> {
                vRecursionDate();
                vMenu();
            }
            default -> {
                System.out.print(sANSI_RED + "Введите число из представленного меню" + sANSI_RED);
                vMenu();
            }
        }
    }

    public static void main(String[] args) {
        vMenu();
    }

    public static void vHelloWorld() {
        System.out.print(sANSI_BLUE + "Вы выбрали: Вывод в консоль \n'Hello World!\n" + sANSI_BLUE);
    }

    public static void vExitProgram() {
        System.out.print("Вы выбрали: Выход из программы.\nДо свидания, надеемся, что вы еще вернетесь.\n");
        System.exit(0);
    }

    public static void vCalc() {
        //Z/X + 7*sqrt(Y)
        Scanner in = new Scanner(System.in);
        System.out.print(
                sANSI_BLUE + "Формула: Z/X + 7*sqrt(Y)\n" + sANSI_BLUE
        );
        try {
            System.out.print(
                    sANSI_BLUE + "Введите число X: " + sANSI_BLUE
            );
            int inputValX = in.nextInt();
            if (inputValX == 0) {
                System.out.print(
                        sANSI_RED + "Вводимое число не должно быть меньше или равное 0. \nПовторите ввод заново\n" + sANSI_RED
                );
                vCalc();
            }
            System.out.print(
                    sANSI_BLUE + "Введите число Y: " + sANSI_BLUE
            );
            int inputValY = in.nextInt();
            if (inputValY < 0) {
                System.out.print(
                        sANSI_RED + "Вводимое число не должно быть меньше или равное 0. \nПовторите ввод заново\n" + sANSI_RED
                );
                vCalc();
            }
            System.out.print(
                    sANSI_BLUE + "Введите число Z: " + sANSI_BLUE

            );
            int inputValZ = in.nextInt();
            double sum = (inputValZ / inputValX) + (7 * Math.sqrt(inputValY));

            String formatNumber = new DecimalFormat("#0.000").format(sum);
            if (!Double.isNaN(sum)) {
                System.out.printf(sANSI_PURPLE + "Ваш ответ: " + formatNumber + sANSI_PURPLE);
            } else {
                System.out.printf(sANSI_PURPLE + "Ваш ответ: Не число поэтому провероверьте вводиммые числа, особенно то, что в корне\n" + sANSI_PURPLE);
                vCalc();
            }
        } catch (Exception e) {

            System.out.print(sANSI_RED + "Ошибка: введен недопустимый символ.\n" +
                    "Пожалуйста, проверьте корректность вводимых данных\n" + sANSI_RED);
            vCalc();
        }

    }

    public static int iValueDifference(int valueOneDay, int valueOneMonth, int valueOneYear, int valueTwoDay, int valueTwoMonth, int valueTwoYear) {

        if ((valueOneDay > 31) || (valueOneMonth > 12) || (valueOneYear < 2021)) {
            System.out.print(sANSI_RED + "Ошибка\n" +
                    "дата окончания меньше чем дата начала\n" +
                    "Повторите пожалуйста ввод\n");
            vRecursionDate();
        } else if ((valueTwoDay > 31) || (valueTwoMonth > 12) || (valueTwoYear < 2021)) {
            System.out.print(sANSI_RED + "Ошибка\n" +
                    "дата окончания меньше чем дата начала\n" +
                    "Повторите пожалуйста ввод\n");
            vRecursionDate();
        }

        int result = 0;
        return result;

    }

    public static void vRecursionDate() {

        //Y+sqrt(X % Z)
        Scanner in = new Scanner(System.in);

        System.out.print(
                sANSI_BLUE + "Введите значение Даты: " + sANSI_BLUE
        );
        int iInputOneDay = in.nextInt();
        System.out.print(
                sANSI_BLUE + "Введите значение Месяца: " + sANSI_BLUE
        );
        int iInputOneMonth = in.nextInt();
        System.out.print(
                sANSI_BLUE + "Введите значение Года: " + sANSI_BLUE
        );
        int iInputOneYear = in.nextInt();
        System.out.print(
                sANSI_BLUE + ": " + sANSI_BLUE
        );
        int iInputTwoDay = in.nextInt();
        System.out.print(
                sANSI_BLUE + "Введите значение Месяца: " + sANSI_BLUE
        );
        int iInputTwoMonth = in.nextInt();
        System.out.print(
                sANSI_BLUE + "Введите значение Года: " + sANSI_BLUE
        );
        int iInputTwoYear = in.nextInt();
        System.out.print(
                sANSI_BLUE + ": " + sANSI_BLUE
        );
        System.out.print(iValueDifference(iInputOneDay, iInputOneMonth, iInputOneYear, iInputTwoDay, iInputTwoMonth, iInputTwoYear));


    }
}


