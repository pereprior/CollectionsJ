package T5.ej2;

import java.util.Stack;

/**
 * @author Pere Prior
 */
public class ArithmeticExpressions {

    public static void main(String[] args) {
        System.out.println(arithmeticStack("20 2 /"));
    }

    public static int arithmeticStack(String message){
        String operators = "+-*/";
        Stack<Integer> stack = new Stack<>();
        String number = "";
        int result;

        for (int i = 0; i<message.length(); i++){
            char c = message.charAt(i);
            if(Character.isDigit(c)){
                number+=c;
            }
            if(Character.isWhitespace(c) && !number.isEmpty()){
                stack.push(Integer.parseInt(number));
                number="";
            }
            if (operators.contains(String.valueOf(c))) {
                switch(c) {
                    case '+':
                        result=0;
                        while (!stack.empty()) {
                            result += stack.pop();
                        }
                        stack.push(result);
                        break;
                    case '-':
                        int a = stack.pop();
                        int b = stack.pop();
                        result = b - a;
                        stack.push(result);
                        break;
                    case '*':
                        result=1;
                        while (!stack.empty()) {
                            result *= stack.pop();
                        }
                        stack.push(result);
                        break;
                    case '/':
                        result = stack.pop();
                        while (!stack.empty()) {
                            result /= stack.pop();
                        }
                        stack.push(result);
                        break;
                }
            }
        }
        return stack.pop();
    }

}
