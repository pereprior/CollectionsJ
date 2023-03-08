package T2.ej4;

import java.util.ArrayList;
import java.util.Iterator;

import static Utilities.Util.readLine;

/**
 * @author Pere Prior
 */

public class Present {

    public static void main(String[] args) {
        gates = new ArrayList<>();
        readGates(readLine("Set the gates to visit:"));
        System.out.println(distribute());

    }

    public static void readGates(String message){
        char word;
        String currentNumber="";
        boolean isDigit=false;

        for(int i = 0; i < message.length(); i++){

            word = message.charAt(i);

            if(Character.isDigit(word)){

                currentNumber+=word;
                isDigit=true;

            } else {
                if (isDigit){

                    gates.add(Integer.parseInt(currentNumber));
                    currentNumber="";

                }
            }

        }

        if (!currentNumber.isEmpty()){
            gates.add(Integer.parseInt(currentNumber));
        }
    }

    public static String distribute() {
        String result = "The order is: ";
        int actual = gates.get(0);
        int diff, min, temp;
        Iterator<Integer> iterator;

        while (!gates.isEmpty()) {
            min = Integer.MAX_VALUE;
            temp = 0;
            iterator = gates.iterator();

            while (iterator.hasNext()) {
                int gate = iterator.next();
                diff = Math.abs(gate - actual);

                if (diff <= min) {
                    min = diff;
                    temp = gate;
                }
            }

            actual = temp;
            result += actual + " ";
            iterator.remove();
        }

        return result;
    }


    private static ArrayList<Integer> gates;

}
