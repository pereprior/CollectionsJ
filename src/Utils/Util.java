package Utils;

import java.util.ArrayList;
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

    public static ArrayList<String> divideString(String message){
        ArrayList<String> list = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < message.length(); i++){
            if (message.charAt(i) == ' '){
                list.add(word.toString());
                word.delete(0, word.length());
            } else {
                word.append(message.charAt(i));
            }
        }
        if (word.length() > 0) { // Agregar la última palabra, si existe
            list.add(word.toString());
        }
        return list;
    }

    private static Scanner inputValue = new Scanner(System.in).useLocale(Locale.US);

}
