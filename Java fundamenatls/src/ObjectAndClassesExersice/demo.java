package ObjectAndClassesExersice;

import ObjectsAndClasses.Students;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo {
    public static void main(String[] args) {


        Person person1 = new Person("Pavel", 31);
        Person person2 = new Person("Peter", 34);
        Person person3 = new Person("Ivan", 21);

        List<Person> persons = new ArrayList<>(Arrays.asList(person1, person2, person3));
        persons.stream().sorted((p1, p2) -> Integer.compare(p1.year, p2.year))
                .forEach(s -> System.out.println(s.getData()));

//        System.out.println(person1.getData());
    }

    static class Person {
        String name;
        int year;

        Person() {
        }

        ;

        Person(String name, int year) {
            this.name = name;
            this.year = year;
        }

        String getData() {
            return String.format("I am %s, and I'm %d years old!", this.name, this.year);
        }
    }
}
