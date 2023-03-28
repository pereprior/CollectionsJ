package T6.ej3;

import T6.ej1.Person;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * @author Pere Prior
 */
public class UniqueNames {

    public static void main(String[] args) {
        Person juan = new Person("Juan","Heredia",1953);
        Person juan2 = new Person("Juan","Arnau",1987);
        Person fernando = new Person("Fernando","Bea",1969);
        Person manuela = new Person("Manuela","Martinez",2001);
        ArrayList<Person> people = new ArrayList<>();
        people.add(juan);
        people.add(juan2);
        people.add(manuela);
        people.add(fernando);
        printPeople(people);
    }

    public static void printPeople(ArrayList<Person> people){
        people.stream()
                .map(Person::getFirstName)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

}
