package main.Menu;


import main.General.Input;
import main.General.Output;
import main.General.Task;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private static List<Task> _menuItems = null;

    public static List<Task> getMenuItem() {
        if (_menuItems == null) {
            _menuItems = new ArrayList<Task>();
            _menuItems.add(new ExitApp());
            _menuItems.add(new HelloWorld());
            _menuItems.add(new Calculator());
            _menuItems.add(new RecursionDate());
            _menuItems.add(new InputString());
        }
        return _menuItems;
    }

    public static void print() {
        List<Task> menuItems = getMenuItem();
        for (int i = 0; i < menuItems.size(); i++) {
            Output.println("[" + i + "] " + menuItems.get(i).getTitle());
        }
    }

    public static Task sSelectingMenuNumber() {
        int MenuNum = 0;
        List<Task> menuItems = getMenuItem();
        while (true) {
            MenuNum = Input.getInt("Выберите пункт меню");
            if ((MenuNum < 0) || (MenuNum >= menuItems.size())) {
                Output.println("Вы ввели неверный номер пункта.\n" +
                        "Пожалуйста, попробуйте снова.");
                continue;
            }
            return menuItems.get(MenuNum);
        }
    }
}