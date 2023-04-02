package T7.ej2;

/**
 * @author Pere Prior
 */
public class City implements Comparable<City>{

    public City(int plays,int wins){
        this.plays=plays;
        this.wins=wins;
    }

    @Override
    public String toString() {
        return "This city plays "+plays+" times and win "+wins+" times.";
    }

    @Override
    public int compareTo(City city) {
        if (this.plays > city.plays && this.wins <= city.wins) {
            return 1;
        } else {
            return -1;
        }
    }

    private int plays;
    private int wins;

}
