package T2.ej2;

import java.util.ArrayList;
import java.util.Iterator;

import static Utilities.Util.*;

/**
 * @author Pere Prior
 */

public class Height {

    public static void main(String[] args) {

        readHeight(studentNumber());
        showResult();

    }

    public static int studentNumber(){
        return readInteger("How many students do you want to save?");
    }

    public static void readHeight(int n){
        for (int i = 1; i <= n; i++){
            heights.add(readDouble("Set the nº" + i + " student's height:"));
        }
    }

    public static void heightList(){
        int var = 0;
        Iterator<Double> heightIterator = heights.iterator();

        while (heightIterator.hasNext()){
            var++;
            System.out.println(var + ".- " + heightIterator.next());
        }
    }

    public static double heightAverage(){
        double avg=0;
        Iterator<Double> heightIterator = heights.iterator();

        while (heightIterator.hasNext()){
            avg+=heightIterator.next();
        }

        return avg/heights.size();
    }

    public static int tallerStudents(){
        int tallStudents=0;
        Iterator<Double> heightIterator = heights.iterator();

        while (heightIterator.hasNext()){
            if (heightIterator.next()>heightAverage()){
                tallStudents++;
            }
        }

        return tallStudents;
    }

    public static int smallerStudents(){
        int smallStudents=0;
        Iterator<Double> heightIterator = heights.iterator();

        while (heightIterator.hasNext()){
            if (heightIterator.next()<heightAverage()){
                smallStudents++;
            }
        }

        return smallStudents;
    }

    public static void showResult(){
        cleanScreen();
        System.out.println("Student's height list:");
        heightList();
        System.out.println("T1.ej2.Height average: " + heightAverage());
        System.out.println("Number of students taller than average: " + tallerStudents());
        System.out.println("Number of the students smaller than average: " + smallerStudents());
    }

    private static ArrayList<Double> heights = new ArrayList<>();

}
