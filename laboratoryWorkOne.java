import java.util.Objects;
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
        if (Objects.equals(valueInput, "0")) {
            exitProgram();
        } else if (Objects.equals(valueInput, "1")) {
            helloWorld();
        } else if (Objects.equals(valueInput, "2")) {
            System.out.print(ANSI_GREEN + "Вы выбрали: Калькулятор по формуле\n" + ANSI_GREEN);
            menu();
        } else {
            System.out.print(ANSI_RED + "Введите число из представленного меню" + ANSI_RED);
            menu();
        }
    }

    public static void main(String[] args) {
        menu();
    }

    public static void helloWorld() {
        System.out.print(ANSI_GREEN + "Вы выбрали: Вывод в консоль 'Hello World!\n" + ANSI_GREEN);
        menu();
    }

    public static void exitProgram() {
        System.out.print("Вы выбрали: Выход из программы до свидание\n");
        System.exit(0);
    }


}