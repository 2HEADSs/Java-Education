package ObjectAndClassesExersice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            Person person = new Person(command[0], Integer.parseInt(command[1]));
            persons.add(person);
        }

        persons.stream()
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .filter(person -> person.getAge() > 30)
                .forEach(p -> System.out.println(p.toString()));
    }

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("%s - %s", this.name, this.age);
        }
    }
}
