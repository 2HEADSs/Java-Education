package Arrays;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lineOfNumber = scanner.nextLine();

        String[] numberAsString = lineOfNumber.split("\\s+");

        int [] numbers = new int[numberAsString.length];

        for (int i = 0; i < numbers.length; i++) {
                numbers[i]= Integer.parseInt(numberAsString[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
    }
}
