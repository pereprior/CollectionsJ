import java.util.ArrayList;
import java.util.Collections;
import static Utilities.Util.*;

/**
 * @author Pere Prior
 */

public class Car {

    public static void main(String[] args) {

        createCar();
        Collections.sort(cars);
        carList();

    }

    public static void createCar(){
        String line = "-";

        while (!line.equals("")){
            line = readLine("Enter a car name:");
            addNewCar(line);
        }
    }

    public static void carList(){
        cleanScreen();
        System.out.println("Car List:");
        int var = 0;
        for (String car: cars){
            var++;
            System.out.println(var + ".- " + car);
        }
    }

    public static void addNewCar(String car){
        if (!car.equals("")){
            cars.add(car);
        }
    }

    private static ArrayList<String> cars = new ArrayList<>();

}