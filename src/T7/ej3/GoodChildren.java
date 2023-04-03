package T7.ej3;

import T7.ej1.Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Pere Prior
 */
public class GoodChildren {

    public static void main(String[] args) {
        boolean isTrue=true;
        StringBuilder result=new StringBuilder();
        do {
            int number = Utils.Util.readInteger("Enter the children number [0 to finish]:");
            if (number==0){
                isTrue=false;
            }else{
                List<Child> children = new ArrayList<>();
                for (int i = 0; i<number; i++){
                    int goodRate=Utils.Util.readInteger("Enter his good rate:");
                    int presents=Utils.Util.readInteger("Enter his presents number:");
                    children.add(new Child(goodRate,presents));
                }
                result.append(printTasks(children)).append("---\n");
            }
        }while (isTrue);
        Utils.Util.cleanScreen();
        System.out.println(result);
    }

    public static String printTasks(List<Child> children){
        Collections.sort(children);
        Collections.reverse(children);
        StringBuilder print = new StringBuilder();
        for(Child child:children){
            print.append(child.toString()).append("\n");
        }
        return print.toString();
    }

}
