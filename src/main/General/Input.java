package main.General;

import java.util.Scanner;
public class Input {
    public static String getStr () {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
    public static int getInt(String varName)
    {
        Scanner in = new Scanner(System.in);
        Output.print(varName+": ");

        while(!in.hasNextInt())
        {
            in.nextLine();
            Output.println("Вы ввели неверный номер пункта.\n" +
                    "Пожалуйста, попробуйте снова.");
            Output.print(varName+": ");
        }
        return in.nextInt();
    }
}