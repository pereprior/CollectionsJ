package T5.ej1;

import java.util.ArrayList;
import java.util.Stack;

import static Utilities.Util.readLine;

/**
 * @author Pere Prior
 */
public class Parenthesis {

    public static void main(String[] args) {
        String message=readLine("Enter the text:");
        System.out.println(assertParenthesis(message));
    }

    public static boolean assertParenthesis(String message){
        boolean isTrue = false;
        Stack<Character> parenthesis = new Stack<>();
        setSpecialCharacters();

        for(Character character:openCharacters){
            if(stringToArrayList(message).contains(character)){
                isTrue=true;
            }
        }

        return isTrue;
    }

    public static ArrayList<Character> stringToArrayList(String message) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < message.length(); i++) {
            list.add(message.charAt(i));
        }
        return list;
    }

    public static void setSpecialCharacters(){
        openCharacters.add('(');
        openCharacters.add('[');
        openCharacters.add('{');
        closeCharacters.add(')');
        closeCharacters.add(']');
        closeCharacters.add('}');
    }

    private static ArrayList<Character> openCharacters= new ArrayList<>();
    private static ArrayList<Character> closeCharacters= new ArrayList<>();

}
