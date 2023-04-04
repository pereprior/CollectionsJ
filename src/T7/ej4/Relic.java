package T7.ej4;

/**
 * @author Pere Prior
 */
public class Relic implements Comparable<Relic>{

    public Relic(String name, int value, int weight){
        if (name.length() < 10) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("The name of the relic is too long.");
        }
        if (value<=1000 && value>=1) {
            this.value = value;
        } else {
            throw new IllegalArgumentException("The value of the relic is not a good value.");
        }
        if (weight<=1000 && weight>=1) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("The weight of the relic is not a good value.");
        }
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Relic r) {
        return Integer.compare(this.value, r.value);
    }

    private String name;
    private int value;
    private int weight;
}
