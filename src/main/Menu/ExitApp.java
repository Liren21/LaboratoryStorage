package main.Menu;

import main.General.Output;
import main.General.Task;

public class ExitApp extends Task {
    public ExitApp()
    {
        _title = "Выход из программы";
    }
    public void execute() {
        Output.println("Вы выбрали: Выход из программы.\nДо свидания, надеемся, что вы еще вернетесь.\n");
        System.exit(0);
    }
}
