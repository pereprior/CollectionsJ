package T5.ej1;

import java.util.Stack;

/**
 * @author Pere Prior
 */
public class Parenthesis {

    public static void main(String[] args) {
        System.out.println(checkParenthesis("{([{}])}"));
        System.out.println(checkParenthesis("{([{uno}{otro}])([])}"));
        System.out.println(checkParenthesis("{([{dos}}])([])}"));
        System.out.println(checkParenthesis("{([{}{}])[])}"));
    }

    public static boolean checkParenthesis(String message) {
        Stack<Character> parenthesis = new Stack<>();
        String openCharacters = "([{";
        String closeCharacters = ")]}";

        for (int i = 0; i < message.length(); i++) {
            char element = message.charAt(i);
            if (openCharacters.indexOf(element) != -1) {
                parenthesis.push(element);
            } else if (closeCharacters.indexOf(element) != -1) {
                if (parenthesis.isEmpty() || openCharacters.indexOf(parenthesis.pop()) != closeCharacters.indexOf(element)) {
                    return false;
                }
            }
        }

        return parenthesis.isEmpty();
    }

}
