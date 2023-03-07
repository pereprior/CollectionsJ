package Utilities;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Util {

    public static int readInteger(String message) throws InputMismatchException {
        int number;
        while (true) {
            try {
                System.out.println(message);
                number = inputValue.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Is not a valid number");
                inputValue.nextLine();
            }

        }
        return number;

    }

    public static double readDouble(String message) throws InputMismatchException {
        double number;
        while (true) {
            try {
                System.out.println(message);
                number = inputValue.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Is not a valid number");
                inputValue.nextLine();
            }
        }
        return number;
    }

    public static String readLine(String message) throws InputMismatchException {
        System.out.println(message);
        return inputValue.nextLine();
    }

    public static void cleanScreen() {
        for (int x = 0; x < 50; x++) {
            System.out.println(" ");
        }
    }

    private static Scanner inputValue = new Scanner(System.in).useLocale(Locale.US);

}
