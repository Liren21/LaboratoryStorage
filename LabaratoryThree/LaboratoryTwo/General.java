package LabaratoryThree.LaboratoryTwo;

import java.util.Scanner;

public class General {
    public static int iScannerIntCustom() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static String sScannerStringCustom() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
