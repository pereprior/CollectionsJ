package Utilities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {

    public static int readNumber(String message) throws InputMismatchException {
        int number;
        while (true) {
            try {
                inputValue = new Scanner(System.in);
                System.out.println(message);
                number = inputValue.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Is not a valid number");
            }

        }
        return number;

    }

    public static String readLine(String message) throws InputMismatchException {
        inputValue = new Scanner(System.in);
        System.out.println(message);
        return inputValue.nextLine();
    }

    private static Scanner inputValue = new Scanner(System.in);

}
