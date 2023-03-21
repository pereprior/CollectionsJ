package T4.ej5;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Pere Prior
 */
public class SetUnion {

    public static void main(String[] args) {
        Set<String> warm = new HashSet<>();
        warm.add("red");
        warm.add("yellow");
        Set<String> cold = new HashSet<>();
        cold.add("blue");
        cold.add("green");
        System.out.println(setUnion(warm,cold));
    }

    public static Set<String> setUnion(Set<String> set1, Set<String> set2){
        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }

}
