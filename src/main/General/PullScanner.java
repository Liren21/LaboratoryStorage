package main.General;

import java.util.Scanner;

public class PullScanner {
    public static int iScannerCustom() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static String sScannerCustom() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
