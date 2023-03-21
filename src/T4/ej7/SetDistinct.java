package T4.ej7;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Pere Prior
 */
public class SetDistinct {

    public static void main(String[] args) {
        Set<String> warm = new HashSet<>();
        warm.add("red");
        warm.add("green");
        Set<String> cold = new HashSet<>();
        cold.add("blue");
        cold.add("green");
        System.out.println(setDistinct(warm,cold));
    }

    public static Set<String> setDistinct(Set<String> set1, Set<String> set2){
        Set<String> distinct = new HashSet<>();
        for(String element:set1){
            if(!set2.contains(element)){
                distinct.add(element);
            }
        }
        for(String element:set2){
            if(!set1.contains(element)){
                distinct.add(element);
            }
        }
        return distinct;
    }

}
