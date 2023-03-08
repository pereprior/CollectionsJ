package T3.ej1;

import java.util.HashMap;
import static Utilities.Util.*;
import java.util.Map;

/**
 * @author Pere Prior
 */

public class Capital {

    public static void main(String[] args) {

        Map<String, String> capitales = new HashMap<>();
        readMaps(capitales);
        mapList(capitales);

    }

    public static void readMaps(Map<String, String> map){
        map.put("Spain", "Madrid");
        map.put("France", "Paris");
        map.put("England", "London");
        map.put("Italy", "Rome");
        map.put("Germany", "Berlin");
    }

    public static void mapList(Map<String, String> map){
        String country = readLine("Enter a European country:");
        System.out.println(map.getOrDefault(country,"Sorry, put another country"));
    }

}
