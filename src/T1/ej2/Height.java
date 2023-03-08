package T1.ej2;

import java.util.ArrayList;

import static Utilities.Util.*;

/**
 * @author Pere Prior
 */

public class
Height {

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
        for (Double height: heights){
            var++;
            System.out.println(var + ".- " + height);
        }
    }

    public static double heightAverage(){
        double avg=0;
        for (Double height: heights){
            avg+=height;
        }
        return avg/heights.size();
    }

    public static int tallerStudents(){
        int tallStudents=0;
        for (Double height: heights){
            if (height>heightAverage()){
                tallStudents++;
            }
        }
        return tallStudents;
    }

    public static int smallerStudents(){
        int smallStudents=0;
        for (Double height: heights){
            if (height<heightAverage()){
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
