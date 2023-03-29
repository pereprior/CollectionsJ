package T6.ej6;

import T6.ej1.Person;

import java.util.ArrayList;

/**
 * @author Pere Prior
 */
public class PersonInputStreamer {

    public static void main(String[] args) {
        boolean isTrue = true;
        ArrayList<Person> people = new ArrayList<>();

        do {
            String message = Utils.Util.readLine("Enter [NAME SURNAME BIRTHYEAR] in this order:");
            ArrayList<String> elements = Utils.Util.divideString(message);
            if(message.isEmpty()){
                isTrue=false;
            } else {
                people.add(new Person(elements.get(0),elements.get(1),Integer.parseInt(elements.get(2))));
            }
        } while (isTrue);

        people.stream()
                .map(Person::getLastName)
                .sorted()
                .forEach(System.out::println);
    }

}
