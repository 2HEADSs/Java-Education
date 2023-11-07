package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    static class Student {
        String firstName;
        String lastName;
        int age;
        String city;
        Student(String firstName, String lastName, int age,String city){

            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
        }
        boolean isFrom(String city){
            return  this.city.equals(city);
        }

        String getInfo(){
            return  String.format("%s %s is %d years old",this.firstName,this.lastName, this.age);
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String [] studentParameters = line.split("\\s+");
            String firstName = studentParameters[0];
            String lastName = studentParameters[1];
            int age = (Integer.parseInt(studentParameters[2]));
            String city = studentParameters[3];

            students.add(new Student(firstName,lastName,age,city));




            line = scanner.nextLine();
        }
        String city = scanner.nextLine();
        for(Student student: students){
            if(student.isFrom(city)){
                System.out.println(student.getInfo());
            }
        }
    }
}
