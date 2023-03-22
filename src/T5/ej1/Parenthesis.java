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
        boolean isTrue = true;
        Stack<Character> parenthesis=new Stack<>();
        setSpecialCharacters();

        for(int i = 0; i<message.length(); i++){
            if (checkParenthesis(message.charAt(i),openCharacters)!='f'){
                parenthesis.push(message.charAt(i));
            }

            if (checkParenthesis(message.charAt(i),closeCharacters)!='f'){
                /*if (parenthesis.pop()!=checkParenthesis()){
                    isTrue=false;
                }*/
            }
        }

        return isTrue;
    }

    private static char checkParenthesis(Character character, ArrayList<Character> characters) {
        char parenthesis='f';
        for(Character element:characters){
            if(character==element){
                parenthesis=character;
            }
        }
        return parenthesis;
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
