package T3.ej5;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Pere Prior
 */
public class Loot {

    public static void main(String[] args) {
        System.out.println(giveMoney(2,10,20,50,200,500));
    }

    public static String giveMoney(int people, int ... dollars){
        Map<Integer,String> gives = new HashMap<>();

        for (int i = 0; i < dollars.length; i++) {
            String loot = gives.get(i%people);

            if (loot == null){
                gives.put(i%people, "" + dollars[i]);
            }else{
                gives.put(i%people, loot + " " + dollars[i]);
            }
        }

        return gives.toString();
    }

}
