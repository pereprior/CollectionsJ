package T6.ej4;

import java.util.ArrayList;

/**
 * @author Pere Prior
 */
public class UserInputStreamer {

    public static void main(String[] args) {
        boolean isTrue = true;
        ArrayList<String> elements = new ArrayList<>();

        do {
            String message = Utils.Util.readLine("Enter random text:");
            if(message.isEmpty()){
                isTrue=false;
            } else {
                elements.add(message);
            }
        } while (isTrue);

        elements.stream()
                .forEach(System.out::println);
    }

}
