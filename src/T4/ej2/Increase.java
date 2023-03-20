package T4.ej2;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Pere Prior
 */
public class Increase {

    public static void main(String[] args) {
        HashSet<Integer> sets = new HashSet<>();
        sets.add(10);
        sets.add(8);
        sets.add(9);

        System.out.println(increaseSet(sets));
    }

    public static HashSet<Integer> increaseSet(HashSet<Integer> set){
        Iterator<Integer> it = set.iterator();
        HashSet<Integer> newSet = new HashSet<>();
        while (it.hasNext()){
            newSet.add(it.next()+1);
        }
        return newSet;
    }

}
