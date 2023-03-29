package T3.ej3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static Utils.Util.*;

/**
 * @author Pere Prior
 */

public class phoneNumber2 {

    public static void main(String[] args) {
        ArrayList<Integer> manoloPhones = new ArrayList<>();
        manoloPhones.add(689326781);
        manoloPhones.add(938674524);
        ArrayList<Integer> pacoPhones = new ArrayList<>();
        pacoPhones.add(634219883);
        ArrayList<Integer> pacaPhones = new ArrayList<>();
        pacaPhones.add(647938512);
        pacaPhones.add(947564721);
        pacaPhones.add(910);

        phone.put("Manolo", manoloPhones);
        phone.put("Paco", pacoPhones);
        phone.put("Paca", pacaPhones);

        contactList(phone);

    }

    public static void contactList(Map<String, ArrayList<Integer>> phone){
        String contact = readLine("Enter the contact name:");
        if (phone.containsKey(contact)){
            System.out.println(phone.get(contact));
        } else {
            System.out.println("This key doesn't exists");
        }
    }

    private static final Map<String, ArrayList<Integer>> phone = new HashMap<>();

}