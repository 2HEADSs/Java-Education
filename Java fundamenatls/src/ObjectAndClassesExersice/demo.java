package ObjectAndClassesExersice;

public class demo {
    public static void main(String[] args) {


        Person p1 = new Person("Pavel", 31);
        Person p2 = new Person("Peter", 34);
        Person p3 = new Person("Ivan", 21);

        
    }

    static class Person {
        String name;
        int year;

        Person() {
        };

        Person(String name, int year) {
            this.name = name;
            this.year = year;
        }
        String getData(){
            return String.format("I am %s, and I'm %d years old", this.name, this.year);
        }
    }
}
