package T6.ej1;

import java.util.ArrayList;

/**
 * @author Pere Prior
 */
public class Born1970 {

    public static void main(String[] args) {
        Person juan = new Person("Juan","Heredia",1953);
        Person manuela = new Person("Manuela","Martinez",1987);
        Person fernando = new Person("Fernando","Bea",1969);
        ArrayList<Person> people = new ArrayList<>();
        people.add(juan);
        people.add(manuela);
        people.add(fernando);
        printPeople(people);
    }

    public static void printPeople(ArrayList<Person> people){
        long count = people.stream()
                .filter(person -> person.getBirthYear() < 1970)
                .count();
        System.out.println("Count: " + count);
    }

}

