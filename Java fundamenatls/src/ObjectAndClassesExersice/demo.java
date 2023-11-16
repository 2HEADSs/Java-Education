package ObjectAndClassesExersice;

public class demo {
    public static void main(String[] args) {


        Person p1 = new Person("pavel", 23);
        Person p2 = new Person();

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
    }
}
