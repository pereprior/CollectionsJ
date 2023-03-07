import java.util.ArrayList;

/**
 * @author Pere Prior
 */

public class AddAll {

    public static void main(String[] args) {

        ArrayList<String> one = new ArrayList<>();
        one.add("One");
        one.add("Two");
        one.add("Three");

        ArrayList<String> two = new ArrayList<>(one);
        two.add("four");
        two.add("five");

        ArrayList<String> three = new ArrayList<>();
        three.addAll(two);

        for(String num:three){
            System.out.println(num);
        }

    }

}
