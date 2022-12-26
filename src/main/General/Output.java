package main.General;

public class Output {
    public static void print(String message) {
        System.out.print(message);
    }
    public static void println(String message) {
        System.out.println(message);
    }
    public static void printResult (String str, double res) {
        System.out.printf(str, res);
    }
    public static void printData (String str,int day, int mouth, int year) {
        System.out.printf(str, day, mouth, year);
    }
}