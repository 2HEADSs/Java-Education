package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    static class Student {

    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student());
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while (!line.equals("end")) {

            line = scanner.nextLine();
        }
        String city = scanner.nextLine();
        for(Student student: students){
            if(student.getCity().equals(city)){
                System.out.println(student.getInfo());
            }
        }
    }
}
