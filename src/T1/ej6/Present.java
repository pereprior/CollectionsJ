package T1.ej6;

import java.util.ArrayList;

import static Utils.Util.*;

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
        int index = -1;

        while (!gates.isEmpty()) {
            min=Integer.MAX_VALUE;
            temp=0;

            for (int i = 0; i < gates.size(); i++) {
                diff = Math.abs(gates.get(i) - actual);

                if (diff <= min) {
                    min = diff;
                    temp = gates.get(i);
                    index = i;
                }
            }

            actual = temp;
            result += actual+" ";
            gates.remove(index);

        }

        return result;
    }


    private static ArrayList<Integer> gates;

}
