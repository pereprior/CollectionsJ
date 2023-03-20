package T4.ej1;

import java.util.Set;

/**
 * @author Pere Prior
 */
public class HashSet {

    public static void main(String[] args) {
        Set<Integer> sets = new java.util.HashSet<>();

        sets.add(20);
        sets.add(3);
        sets.add(8);
        sets.add(3);

        System.out.println(sets);
    }

}
