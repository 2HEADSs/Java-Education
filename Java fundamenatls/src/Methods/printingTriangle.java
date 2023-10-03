package Methods;

import java.util.Scanner;

public class printingTriangle {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();

        createTriangles(number);

    }

    private static void createTriangles(int number) {
        for (int length = 1; length <= number; length++) {
            getPrintIncreasingNumbers(length);
        }
        ;
        for (int length = number - 1; length > 0; length--) {
            getPrintIncreasingNumbers(length);
        }
        ;
    }

    private static void getPrintIncreasingNumbers(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.print(i);
            if (i < length) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
