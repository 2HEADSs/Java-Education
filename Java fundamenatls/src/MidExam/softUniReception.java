package MidExam;

import java.util.Scanner;

public class softUniReception {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int employeeFirst = scanner.nextInt();
        int employeeSecond = scanner.nextInt();
        int employeeThird = scanner.nextInt();
        int studentsPerHour = employeeFirst + employeeSecond + employeeThird;
//        int studentsPerHour = scanner.nextInt() + scanner.nextInt() + scanner.nextInt();

        int remainingStudents = scanner.nextInt();
        int hoursPassed = 0;

        while(remainingStudents > 0){
            hoursPassed++;
            if(hoursPassed % 4 !=0){
                remainingStudents -= studentsPerHour;
            }
        }

        System.out.printf("Time needed: %dh.", hoursPassed);
    }
}
