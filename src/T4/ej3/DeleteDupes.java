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
        System.out.println(deleteDuplicates(lists));
    }

    public static ArrayList<String> deleteDuplicates(ArrayList<String> list) {
        Set<String> sets = new HashSet<>(list);
        return new ArrayList<>(sets);
    }

}
