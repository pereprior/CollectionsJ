package T3.ej8;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Pere Prior
 */
public class CountCountries {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("file.csv"));
        Map<String,Integer> countries = new HashMap<>();
        String line;
        String[] data;

        while ((line=reader.readLine())!=null){
            data=line.split(",");
            if(data[6] != "País"){
                countries.put(data[6], countries.getOrDefault(data[6],0)+1);
            }
        }
        for(String key:countries.keySet()){
            System.out.println(key + ": " + countries.get(key));
        }
    }

}
