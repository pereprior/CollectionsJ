package T7.ej4;

import T7.ej3.Child;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Pere Prior
 */
public class Tutankamon {

    public static void main(String[] args) {
        boolean isTrue = true;
        StringBuilder result=new StringBuilder();
        Scanner sc = new Scanner(System.in);
        while (isTrue){
            int relicNumber=Utils.Util.readInteger("Enter the relic number [0 to exit]");
            if (relicNumber==0){
                isTrue=false;
            } else {
                ArrayList<Relic> relics=new ArrayList<>();
                for (int i=0; i<relicNumber; i++){
                    System.out.println("Enter the relic name:");
                    String relicName=sc.nextLine();
                    int relicValue=Utils.Util.readInteger("Enter the relic value:");
                    int relicWeight=Utils.Util.readInteger("Enter the relic weight:");
                    relics.add(new Relic(relicName,relicValue,relicWeight));
                }
                result.append(printRelics(relics)).append("\n---\n");
            }
        }
        Utils.Util.cleanScreen();
        System.out.println(result);
    }

    public static String printRelics(List<Relic> relics){
        Collections.sort(relics);
        Collections.reverse(relics);
        StringBuilder print = new StringBuilder();
        for(Relic relic:relics){
            print.append(relic.toString()).append(" ");
        }
        return print.toString();
    }

}
