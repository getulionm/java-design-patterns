package behavioral.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyEverydayDemo {

    private static void printContents(List<Person> people) {
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }

    public static void main(String[] args) {

        Person bryan = new Person("Bryan", "801-555-1212", 39);
        Person mark = new Person("Mark", "701-111-9696", 42);
        Person chris = new Person("Chris", "601-555-4545", 27);
        Person ted = new Person("Ted", "601-444-4545", 18);

        List<Person> people = new ArrayList<Person>();
        people.add(bryan);
        people.add(mark);
        people.add(chris);
        people.add(ted);

        System.out.println("Not sorted");
        printContents(people);


        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if (p1.getAge() < p2.getAge())
                    return -1;
                else if (p1.getAge() > p2.getAge())
                    return 1;
                else
                    return 0;
            }
        });


        System.out.println("\nSorted by age");
        printContents(people);


        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });


        System.out.println("\nSorted by name");
        printContents(people);
    }
}
