package T7.ej2;

import java.util.*;

/**
 * @author Pere Prior
 */
public class Lottery {

    public static void main(String[] args) {
        boolean isTrue=true;

        do {
            int number = Utils.Util.readInteger("Enter the cities number [0 to exit]:");
            if (number==0){
                isTrue=false;
            }else{
                List<City> cities = new ArrayList<>();
                for (int i = 0; i < number; i++) {
                    int moneyInvested = Utils.Util.readInteger("Enter the city money invested:");
                    int prizesWon = Utils.Util.readInteger("Enter the city prizes won:");
                    cities.add(new City(moneyInvested, prizesWon));
                }

                Collections.sort(cities);

                int moneyInvested = 0;
                int prizesWon = 0;
                for (City city : cities) {
                    moneyInvested += city.getMoneyInvested();
                    prizesWon += city.getPrizesWon();
                    if (moneyInvested < prizesWon) {
                        isTrue = false;
                        break;
                    }
                }
                System.out.println(isTrue ? "NO" : "YES");
            }
        }while (isTrue);
    }

}
