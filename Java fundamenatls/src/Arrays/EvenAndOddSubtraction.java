package Arrays;

import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] numbersAsString = line.split("\\s+");


        int evenSum = 0;
        int oddSum = 0;
        int[] sums = new int[2];
        for (String s : numbersAsString) {
            int number = Integer.parseInt(s);
//            if (number % 2 == 0) {
//                evenSum += number;
//            } else {
//                oddSum += number;
//            }
            sums[number % 2] += number;
        }
//        int resul = evenSum-oddSum;
//        System.out.println(result);
        System.out.println(sums[0]-sums[1]);

    }
}
