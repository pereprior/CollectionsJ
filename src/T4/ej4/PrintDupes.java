package T4.ej4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Pere Prior
 */
public class PrintDupes {

    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<>();
        lists.add("Hola");
        lists.add("Hola");
        lists.add("Adios");
        lists.add("Hola");
        System.out.println(findDuplicates(lists));
    }

    public static Set<String> findDuplicates(ArrayList<String> list){
        Set<String> duplicates = new HashSet<>();
        for (String element : list) {
            if (Collections.frequency(list, element) > 1) {
                duplicates.add(element);
            }
        }
        return duplicates;
    }

}
