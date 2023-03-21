package T4.ej6;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Pere Prior
 */
public class SetIntersection {

    public static void main(String[] args) {
        Set<String> warm = new HashSet<>();
        warm.add("red");
        warm.add("green");
        Set<String> cold = new HashSet<>();
        cold.add("blue");
        cold.add("green");
        System.out.println(setIntersection(warm,cold));
    }

    public static Set<String> setIntersection(Set<String> set1, Set<String> set2){
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }

}
