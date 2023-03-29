package T7.ej1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Pere Prior
 */
public class Felipe {

    public static void main(String[] args) {
        boolean isTrue=true;
        do {
            int number = Utils.Util.readInteger("Enter the tasks number:");
            if (number==0){
                isTrue=false;
            }else{
                Map<Integer, Integer> tasks = new HashMap<>();
                for (int i = 0; i<number; i++){
                    int key=Utils.Util.readInteger("Enter the priority of the task:");
                    int value=Utils.Util.readInteger("Enter the priority of the task:");
                    tasks.put(key,value);
                }
                for (Integer element:tasks.keySet()){
                    System.out.println(element+" "+tasks.get(element));
                }
                System.out.println("---");
            }
        }while (isTrue);
    }

}
