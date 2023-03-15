package T3.ej6;

import java.util.HashMap;
import java.util.Map;
import static Utilities.Util.*;

/**
 * @author Pere Prior
 */
public class Frequency {

    public static void main(String[] args) {
        String message = readLine("Enter random words:");
        countWords(message);
    }

    public static void countWords(String message){
        Map<String, Integer> numberWord = new HashMap<>();
        String[] words = message.split(" ");

        for(String word:words){
            numberWord.put(word, numberWord.getOrDefault(word,0)+1);
        }
        for(String key:numberWord.keySet()){
            System.out.println(key + " - " + numberWord.get(key));
        }
    }

}
