package T3.ej2;

import java.util.HashMap;
import java.util.Map;

import static Utilities.Util.*;

/**
 * @author Pere Prior
 */

public class phoneNumber {

    public static void main(String[] args) {
        phone.put("Manolo", 689326781);
        phone.put("Paco", 634219883);
        phone.put("Paca", 647938512);

        phoneList(phone);

    }

    public static void phoneList(Map<String, Integer> phone){
        String contact = readLine("Enter the contact name:");
        if (phone.containsKey(contact)){
            System.out.println(phone.get(contact));
        } else {
            System.out.println("This key doesn't exists");
        }
    }

    private static final Map<String, Integer> phone = new HashMap<>();

}
