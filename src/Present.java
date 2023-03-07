import java.util.ArrayList;
import static Utilities.Util.*;

/**
 * @author Pere Prior
 */

public class Present {

    public static void main(String[] args) {
        gates = new ArrayList<>();
        readGates(readLine("Set the gates to visit:"));
        gatesList();

    }

    /**
     * From a text string we obtain the numbers
     * @param message where do we look for the numbers
     */
    public static void readGates(String message){
        char word;
        String currentNumber="";
        boolean isDigit=false;

        for(int i = 0; i < message.length(); i++){

            word = message.charAt(i);

            //If the character is a number, we store it in a text string.
            if(Character.isDigit(word)){

                currentNumber+=word;
                isDigit=true;

            //If not, we introduce the string that we have accumulated inside the array.
            } else {
                if (isDigit){

                    gates.add(Integer.parseInt(currentNumber));
                    currentNumber="";

                }
            }

        }

        //Returns the currentNumber if the last character of the string was a number
        if (!currentNumber.isEmpty()){
            gates.add(Integer.parseInt(currentNumber));
        }
    }

    public static void gatesList(){
        for (Integer gate: gates){
            System.out.println(gate);
        }
    }

    private static ArrayList<Integer> gates;

}
