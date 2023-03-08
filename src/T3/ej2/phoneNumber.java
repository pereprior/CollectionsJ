package T3.ej2;

import java.util.HashMap;
import java.util.Map;

import static Utilities.Util.readLine;

/**
 * @author Pere Prior
 */

public class phoneNumber {

    public static void main(String[] args) {
        Map<String, Integer> phoneNumber = new HashMap<>();
        phoneNumber.put("Manolo", 689326781);
        phoneNumber.put("Paco", 634219883);
        phoneNumber.put("Paca", 647938512);


    }

    public static void phoneList(Map<String, Integer> phone){
        String contact = readLine("Enter the contact name:");
        System.out.println();
    }

}
