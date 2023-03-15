package T3.ej4;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Pere Prior
 */
public class BestEnd {

    public static void main(String[] args) {
        calculateLastDigit("23456","09876","65732","85936");
        System.out.println(lottery);

    }

    public static void calculateLastDigit(String ... numbers){
        int lastDigit;

        for (String number:numbers){
            stringFilter(number);
            lastDigit = Integer.parseInt("" + number.charAt(number.length()-1));
            lottery.put(lastDigit, lottery.getOrDefault(lastDigit,0)+1);
        }

    }

    public static String stringFilter(String string) {
        if (string.length() != 5) {
            throw new IllegalArgumentException("The number is invalid, enter a number with 5 digits");
        } else if (string.matches("\\d+")) {
            return string;
        } else {
            throw new IllegalArgumentException("The number is invalid, enter a number with 5 digits");
        }
    }


    private static Map<Integer, Integer> lottery = new HashMap<>();

}
