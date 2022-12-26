package main.General;

import main.General.Validation.ValidationException;

public abstract class Task {
    protected String _title = "Items.Menu title";

    public String getTitle()
    {
        return _title;
    }
    public abstract void execute() throws ValidationException;
}