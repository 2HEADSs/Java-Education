package Methods;

import java.util.Scanner;

public class printingTriangle {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();


        getPrintIncreasingNumbers(number);
    }

    private static void getPrintIncreasingNumbers(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.println(i);
            if (i < length) {
                System.out.println(" ");

            }
        }
    }
}
