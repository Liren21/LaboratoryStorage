//package main.Home;
//
//import main.General.TextPaint;
//
//import java.util.Scanner;
//
//import static main.Menu.Calculator.vCalc;
//import static main.Menu.HelloWorld.vWithdrawalHelloWord;
//import static main.Menu.InputString.inputVal;
//import static main.Menu.RecursionDate.DateInput;
//
//public class PullMenu {
//    public static void vMenu() throws Exception {
//        System.out.print(
//                TextPaint.sANSI_GREEN + "\n--------------------------------------------------------------------\n\n" +
//                        "Приветствую тебя пользователь, программа обладает следующим функционалом:\n" +
//                        "[0] Выход\n" +
//                        "[1] Вывод в консоль 'Hello World!'\n" +
//                        "[2] Калькулятор по формуле\n" +
//                        "[3] Дата рекурсии   \n" +
//                        "[4] Строка   \n" +
//                        "\n--------------------------------------------------------------------\n" +
//                        "\n" +
//                        "Выберите пункт:" + TextPaint.sANSI_GREEN
//        );
//        Scanner in = new Scanner(System.in);
//        String valueInput = in.nextLine();
//        switch (valueInput) {
//            case ("0") -> {
//                vPullExitApp();
//            }
//            case ("1") -> {
//                vWithdrawalHelloWord();
//                vMenu();
//            }
//            case ("2") -> {
//                vCalc();
//                vMenu();
//            }
//            case ("3") -> {
//                DateInput();
//                vMenu();
//            }
//            case ("4") -> {
//                inputVal();
//                vMenu();
//            }
//            default -> {
//                System.out.print(TextPaint.sANSI_RED + "Введите число из представленного меню" + TextPaint.sANSI_RED);
//                vMenu();
//            }
//        }
//    }
//}
