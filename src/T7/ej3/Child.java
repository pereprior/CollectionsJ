package T7.ej3;

/**
 * @author Pere Prior
 */
public class Child implements Comparable<Child> {

    public Child(int priority, int duration) {
        this.goodRate = priority;
        this.presentWeight = duration;
    }

    @Override
    public String toString() {
        return goodRate +" - "+ presentWeight;
    }

    @Override
    public int compareTo(Child child) {
        return Integer.compare(this.goodRate, child.goodRate);
    }

    private int goodRate;
    private int presentWeight;
}
