package T3.ej9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import static Utils.Util.readLine;

public class LastNameFrequency {

    public static void main(String[] args) throws IOException {
        String input = " ";
        while (!input.equals("")){
            input = readLine("Enter the surname:");
            lastName(input);
        }
    }

    private static void lastName(String input) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("file.csv"));
        Map<String,String> surnames = new HashMap<>();
        String line;
        String[] data;

        while ((line=reader.readLine())!=null){
            data=line.split(",");
            if(data.length == 2 && data[0].equals(input.toUpperCase())){
                surnames.put(data[0], data[1]);
            }
        }

        if (surnames.get(input.toUpperCase()) != null) {
            System.out.println("Frecuency: " + surnames.get(input.toUpperCase()));
        }
        if (surnames.get(input.toUpperCase()) == null && input!="") {
            System.out.println("Last name doesn't exists");
        }
    }

}
