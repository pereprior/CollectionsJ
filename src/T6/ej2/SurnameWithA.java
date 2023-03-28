package T6.ej2;

import T6.ej1.Person;

import java.util.ArrayList;

/**
 * @author Pere Prior
 */
public class SurnameWithA {

    public static void main(String[] args) {
        Person juan = new Person("Juan","Heredia",1953);
        Person manuela = new Person("Manuela","Arnau",1987);
        Person fernando = new Person("Fernando","Bea",1969);
        ArrayList<Person> people = new ArrayList<>();
        people.add(juan);
        people.add(manuela);
        people.add(fernando);
        printPeople(people);
    }

    public static void printPeople(ArrayList<Person> people){
        long count = people.stream()
                .filter(person -> person.getLastName().startsWith("A"))
                .count();
        System.out.println("Count: " + count);
    }

}
