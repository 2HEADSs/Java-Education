package ArraysExercise;

import java.util.Scanner;

public class zigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countArrays = Integer.parseInt(scanner.nextLine());

        String[] firstArray = new String[countArrays];
        String[] secondArray = new String[countArrays];

        for (int i = 0; i < countArrays; i++) {
            String[] line = scanner.nextLine().split(" ");
            if (i % 2 == 0) {
                firstArray[i] = line[0];
                secondArray[i] = line[1];
            } else  {
                firstArray[i] = line[1];
                secondArray[i] = line[0];
            }
        }
        for (String elFirstArr: firstArray){
            System.out.printf(elFirstArr +" ");
        }
        System.out.println();
        for (String elSecondArr: secondArray){
            System.out.printf(elSecondArr+" ");
        }
    }
}
