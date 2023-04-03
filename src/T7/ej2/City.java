package T7.ej2;

/**
 * @author Pere Prior
 */
public class City implements Comparable<City>{

    public City(int moneyInvested, int prizesWon) {
        this.moneyInvested = moneyInvested;
        this.prizesWon = prizesWon;
    }

    public int getMoneyInvested() {
        return moneyInvested;
    }

    public int getPrizesWon() {
        return prizesWon;
    }

    @Override
    public int compareTo(City o) {
        double thisRatio = (double) moneyInvested / prizesWon;
        double otherRatio = (double) o.moneyInvested / o.prizesWon;
        int ratioComparison = Double.compare(thisRatio, otherRatio);

        if (ratioComparison == 0) {
            return Integer.compare(moneyInvested, o.moneyInvested);
        }

        return ratioComparison;
    }

    private int moneyInvested;
    private int prizesWon;

}
