package T6.ej4;

/**
 * @author Pere Prior
 */
public class UserInputStreamer {

    public static void main(String[] args) {
        boolean catarina = true;

        do {
            String message = Utilities.Util.readLine("Enter the ");
            if(message.isEmpty()){
                catarina=false;
            }

        } while (catarina);
    }

}
