package T1.ej5;

import java.util.ArrayList;

/**
 * @author Pere Prior
 */

public class Exists {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);

        valueExists(arrayList,3);
        valueExists(arrayList,4);
    }

    public static void valueExists(ArrayList<Integer> arrayList,int value){
        if(arrayList.contains(value)){
            System.out.println("Yes, it contains the number");
        } else {
            System.out.println("Doesn't contains the number");
        }
    }

}
