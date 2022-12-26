package main.App;

import main.General.Console;
import main.General.Task;
import main.General.Validation.ValidationException;

import static main.Menu.Menu.*;

public class LaboratoryWorkTree {

    public static void main(String[] args) throws ValidationException {
        if (args.length == 0) {
            while (true) {
                print();
                Task task = sSelectingMenuNumber();
                task.execute();
            }
        } else {
            Console.StartProgram(args);
        }
    }

}