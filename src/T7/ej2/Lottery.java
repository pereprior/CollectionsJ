package T7.ej2;

import T7.ej1.Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Pere Prior
 */
public class Lottery {

    public static void main(String[] args) {
        boolean isTrue = true;
        StringBuilder result = new StringBuilder();
        while (isTrue) {
            int numberCities = Utils.Util.readInteger("Enter the number of cities [0 to exit]:");
            if (numberCities == 0) {
                isTrue = false;
            } else {
                List<City> cities = new ArrayList<>();
                for (int i = 0; i < numberCities; i++) {
                    int plays = Utils.Util.readInteger("Enter the plays of the city:");
                    int wins = Utils.Util.readInteger("Enter the wins of the city:");
                    cities.add(new City(plays, wins));
                }
                result.append(compareCities(cities)).append("\n");
            }
        }
        System.out.println("---");
        System.out.println(result);
    }
    public static boolean compareCities(List<City> cities) {
        boolean isTrue=true;
        for (int i = 0; i < cities.size() - 1; i++) {
            City city1=cities.get(i);
            City city2=cities.get(i+1);
            int comparator=city1.compareTo(city2);
            if (comparator > 0) {
                isTrue=false;
                break;
            }
        }
        return isTrue;
    }

}
