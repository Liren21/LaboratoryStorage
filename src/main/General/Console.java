package main.General;

import main.Menu.ExitApp;
import main.Menu.HelloWorld;

import java.util.Objects;


public class Console {

    public static void StartProgram(String[] a) {
        int n = -1;
        n = Search(a, n, "-mi");
        if (n == -1) {
            Output.println("Введите число от 0 до 3");
            System.exit(0);
        }
        switch (a[n + 1]) {
            case "0":
                ExitApp exit = new ExitApp();
                exit.execute();
                break;
            case "1":
                HelloWorld hello = new HelloWorld();
                hello.execute();
                break;
            case "2":

                break;
            case "3":

                break;
            case "4":

                break;
            default:
                Output.println("Вы не передали все параметры.");
                break;
        }

    }

    public static int Search(String[] a, int n, String str) {
        for (int i = 0; i < a.length; i++) {
            if (Objects.equals(a[i], str)){
                n = i;
                return n;
            }
        }
        return n;
    }
}
