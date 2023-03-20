package T4.ej3;

import java.util.*;

/**
 * @author Pere Prior
 */
public class DeleteDupes {

    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<>();
        lists.add("Hola");
        lists.add("Hola");
        lists.add("Adios");
        lists.add("Hola");
        deleteDuplicates(lists);
    }

    public static void deleteDuplicates(ArrayList<String> list) {
        Set<String> hashSet = new HashSet<String>(list);

        for (String s: hashSet) {
            list.remove(s);
        }

        Set<String> duplicates = new HashSet<String>(list);
        System.out.println(duplicates);
    }

}
