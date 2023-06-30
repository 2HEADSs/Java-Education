package WhileLoop;

import java.util.Scanner;

public class graduation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double sum = 0;
        int year = 1;
        int excluded = 0;

        while(year<=12){
        if(excluded >1){
            break;
        }
        double currentGrade = Double.parseDouble(scanner.nextLine());
        if(currentGrade<=3){
            excluded++;
            continue;
        }
        sum+= currentGrade;
        year++;
        }

        if(excluded<1){
        double average = sum/12;
        System.out.printf("%s graduated. Average grade: %.2f", name, average);
        }else{
            System.out.printf("%s has been excluded at %d grade%n", name, year);
        }
    }
}
