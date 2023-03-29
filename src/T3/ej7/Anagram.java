package T3.ej7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static Utils.Util.*;

/**
 * @author Pere Prior
 */
public class Anagram {

    public static void main(String[] args) throws IOException {
        String filePath = readLine("Enter the file path:");
        minGroupSize(readFile(filePath));
    }

    public static void minGroupSize(Map<String,List<String>> anagrams){
        int min = readInteger("Enter the minimum valor number:");
        for (Map.Entry<String, List<String>> anagram : anagrams.entrySet()) {
            if (anagram.getValue().size() > min) {
                System.out.println("Anagram: " + anagram.getKey() + " // Values: " + anagram.getValue());
            }
        }
    }

    public static Map<String,List<String>> readFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line = " ";
        Map<String,List<String>> anagrams = new HashMap<>();

        do {
            line = reader.readLine();
            if (line != null) {
                String anagram = getAnagram(line);
                if (anagrams.get(anagram) == null) {
                    anagrams.put(anagram, new ArrayList<String>());
                }
                anagrams.get(anagram).add(line);
            }
        } while (line != null);
        reader.close();
        return anagrams;
    }

    public static String getAnagram(String word) {
        String anagram = "";
        if (word != null) {
            char[] characters = new char[word.length()];
            for (int i = 0; i < word.length(); i++) {
                characters[i] = word.charAt(i);
            }
            Arrays.sort(characters);
            for (int i = 0; i < word.length(); i++) {
                anagram += characters[i];
            }
        }
        return anagram;
    }

}
