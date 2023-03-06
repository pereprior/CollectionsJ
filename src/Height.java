import java.util.ArrayList;

import static Utilities.Util.*;

/**
 * @author Pere Prior
 */

public class Height {

    public static void main(String[] args) {



    }

    public static void createHeight(int n){
        String line = "-";

        for (int i = 0; i < n; i++){
            line = readLine("Enter a student height:");

        }
    }

    public static void carList(){
        System.out.println("Student's height list:");
        int var = 0;
        for (Double height: heights){
            var++;
            System.out.println(var + ".- " + height);
        }
    }

    private static ArrayList<Double> heights = new ArrayList<>();

}
