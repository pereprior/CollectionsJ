package T2.ej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

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
        System.out.println("T1.ej1.Car List:");
        int var = 0;
        Iterator<String> carIterator = cars.iterator();

        while(carIterator.hasNext()){
            var++;
            System.out.println(var + ".- " + carIterator.next());
        }
    }

    public static void addNewCar(String car){
        if (!car.equals("")){
            cars.add(car);
        }
    }

    private static ArrayList<String> cars = new ArrayList<>();

}
