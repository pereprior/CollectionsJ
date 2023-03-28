package T5.ej2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Pere Prior
 */
public class ArithmeticExpressions {

    public static void main(String[] args) {
        System.out.println(arithmeticStack("2 4 6 3 / * +"));
        System.out.println(arithmeticStack("3 5 4 + *"));
        System.out.println(arithmeticStack("1 1 - 8 /"));
        System.out.println("---");
        System.out.println(arithmeticQueue("2 4 6 3 / * +"));
        System.out.println(arithmeticQueue("3 5 4 + *"));
        System.out.println(arithmeticQueue("8 1 1 - /"));
    }

    public static int arithmeticStack(String message){
        Stack<Integer> stack = new Stack<>();

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
                        result = stack.pop() + stack.pop();
                        stack.push(result);
                        break;
                    case '-':
                        result = stack.pop() - stack.pop();
                        stack.push(result);
                        break;
                    case '*':
                        result = stack.pop() * stack.pop();
                        stack.push(result);
                        break;
                    case '/':
                        int a = stack.pop();
                        int b = stack.pop();
                        result = b / a;
                        stack.push(result);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static int arithmeticQueue(String message){
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < message.length(); i++){
            char c = message.charAt(i);
            if(Character.isDigit(c)){
                number += c;
            }
            if(Character.isWhitespace(c) && !number.isEmpty()){
                queue.add(Integer.parseInt(number));
                number = "";
            }
            if (operators.contains(String.valueOf(c))) {
                switch(c) {
                    case '+':
                        result = queue.poll() + queue.poll();
                        queue.add(result);
                        break;
                    case '-':
                        result = queue.poll() - queue.poll();
                        queue.add(result);
                        break;
                    case '*':
                        result = queue.poll() * queue.poll();
                        queue.add(result);
                        break;
                    case '/':
                        int a = queue.poll();
                        int b = queue.poll();
                        result = b / a;
                        queue.add(result);
                        break;
                }
            }
        }
        return queue.poll();
    }

    private static final String operators = "+-*/";
    private static String number = "";
    private static int result;

}
