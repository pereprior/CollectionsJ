package T2.ej3;

import java.util.ArrayList;
import java.util.Iterator;

import static Utilities.Util.readInteger;

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

        Iterator<String> it = three.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }

}
