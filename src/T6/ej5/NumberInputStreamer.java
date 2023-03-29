package T6.ej5;

import java.util.ArrayList;

/**
 * @author Pere Prior
 */
public class NumberInputStreamer {

    public static void main(String[] args) {
        boolean isTrue = true;
        ArrayList<Double> elements = new ArrayList<>();

        do {
            double message = Utils.Util.readDouble("Enter random text:");
            if(message==-1){
                isTrue=false;
            } else {
                elements.add(message);
            }
        } while (isTrue);

        elements.stream()
                .filter(element -> element<5 && element>=1)
                .forEach(System.out::println);
    }

}
