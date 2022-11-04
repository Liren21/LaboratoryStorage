package LaboratoryTwo;

import java.util.Scanner;

public class General {
    public static int iScannerCustom() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static String sScannerCustom() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
