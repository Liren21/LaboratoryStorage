package LabaratoryThree.LaboratoryTwo;

import java.util.Scanner;

public class InputDate {
    public static int iYear() {
        EntryEntity state = new EntryEntity();
        state.vYear();
        return state.iYear;
    }

    public static int iMonth() {
        EntryEntity state = new EntryEntity();
        state.vMonth();
        return state.iMonth;
    }

    public static int iDay() {
        EntryEntity state = new EntryEntity();
        state.vDay();
        return state.iDay;
    }
}

