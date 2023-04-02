package T7.ej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Pere Prior
 */
public class Felipe {

    public static void main(String[] args) {
        boolean isTrue=true;
        StringBuilder result=new StringBuilder();
        do {
            int number = Utils.Util.readInteger("Enter the tasks number [0 to finish]:");
            if (number==0){
                isTrue=false;
            }else{
                List<Task> tasks = new ArrayList<>();
                for (int i = 0; i<number; i++){
                    int priority=Utils.Util.readInteger("Enter the priority of the task:");
                    int duration=Utils.Util.readInteger("Enter the duration of the task:");
                    tasks.add(new Task(priority,duration));
                }
                result.append(printTasks(tasks)).append("---\n");
            }
        }while (isTrue);
        Utils.Util.cleanScreen();
        System.out.println(result);
    }

    public static String printTasks(List<Task> tasks){
        Collections.sort(tasks);
        Collections.reverse(tasks);
        StringBuilder print = new StringBuilder();
        for(Task task:tasks){
            print.append(task.toString()).append("\n");
        }
        return print.toString();
    }

}
