package T1.ej3;

import java.util.ArrayList;
import static Utilities.Util.*;

/**
 * @author Pere Prior
 */

public class ArrayListoArray {

    public static void main(String[] args) {
        ArrayList<Integer> arrayLists = new ArrayList<>();
        int l = readInteger("To what number do you want to count?:");
        readArrayList(arrayLists,l);

        int[] arrays = new int[arrayLists.size()];
        arrayConverter(arrayLists,arrays);
        showArray(arrays);
    }

    public static void showArray(int[] arrays){
        System.out.println("Array Elements:");
        for(int array:arrays){
            System.out.println(array);
        }
    }

    public static void arrayConverter(ArrayList<Integer> arrayLists, int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = arrayLists.get(i);
        }
    }

    public static void readArrayList(ArrayList<Integer> arrayLists, int l){
        for (int i = 1; i <= l; i++){
            arrayLists.add(i);
        }
    }

}
