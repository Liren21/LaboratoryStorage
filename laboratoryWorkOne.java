import java.text.DecimalFormat;
import java.util.Scanner;

public class laboratoryWorkOne {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    public static void menu() {

        Scanner in = new Scanner(System.in);
        System.out.print(
                ANSI_GREEN + "\n--------------------------------------------------------------------\n\n" +
                        "Приветствую тебя пользователь, программа обладает следующим функционалом:\n" +
                        "[0] Выход\n" +
                        "[1] Вывод в консоль 'Hello World!'\n" +
                        "[2] Калькулятор по формуле   \n " +
                        "\n--------------------------------------------------------------------\n" +
                        "\n" +
                        "Выберите пункт:" + ANSI_GREEN
        );
        String valueInput = in.nextLine();
        switch (valueInput) {
            case ("0") -> exitProgram();
            case ("1") -> {
                helloWorld();
                menu();
            }
            case ("2") -> {
                calc();
                menu();
            }
            default -> {
                System.out.print(ANSI_RED + "Введите число из представленного меню" + ANSI_RED);
                menu();
            }
        }
    }
    public static void main(String[] args) {
        menu();
    }
    public static void helloWorld() {
        System.out.print(ANSI_BLUE + "Вы выбрали: Вывод в консоль 'Hello World!\n" + ANSI_BLUE);
        menu();
    }
    public static void exitProgram() {
        System.out.print("Вы выбрали: Выход из программы.\nДо свидания, надеемся, что вы еще вернетесь.\n");
        System.exit(0);
    }
    public static void intputValueU(){
        Scanner in = new Scanner(System.in);
        System.out.print(
                ANSI_BLUE + "Формула: Z/X + 7*sqrt(Y)\nВведите число X: " + ANSI_BLUE
        );
        int inputValX = in.nextInt();
        System.out.print(
                ANSI_BLUE + "Введите число Y: " + ANSI_BLUE
        );
        int inputValY = in.nextInt();
        System.out.print(
                ANSI_BLUE + "Введите число Z: " + ANSI_BLUE
        );
        int inputValZ = in.nextInt();
        double sum = (inputValZ / inputValX) + (7 * Math.sqrt(inputValY));
        String formatNumber = new DecimalFormat("#0.000").format(sum);
        System.out.printf(ANSI_PURPLE + "Ваш ответ: " + formatNumber + ANSI_PURPLE);

    };
    public static void calc() {
        //Z/X + 7*sqrt(Y)
        try {
            intputValueU();
        } catch (Exception e) {
            System.out.print(ANSI_RED + "Ошибка: введен недопустимый символ.\nПожалуйста, проверьте корректность вводимых данных\n" + ANSI_RED);
            intputValueU();
        }
    }
}
