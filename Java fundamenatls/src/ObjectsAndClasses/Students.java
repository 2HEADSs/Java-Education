package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    static class Student {
        boolean isFrom(String city){

        }

        String getInfo(){

        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while (!line.equals("end")) {
            students.add(new Student());

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
