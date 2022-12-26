package main.Menu;

import main.General.Output;
import main.General.Task;
import main.General.TextPaint;

public class HelloWorld extends Task {
    public HelloWorld()
    {
        _title = "Hello world";
    }
    public void execute()
    {
        Output.println(TextPaint.sANSI_BLUE + "Вы выбрали: Вывод в консоль \nHello World!\n" + TextPaint.sANSI_BLUE);
    }
}
