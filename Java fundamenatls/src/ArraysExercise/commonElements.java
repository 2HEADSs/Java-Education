package ArraysExercise;

import java.util.Scanner;

public class commonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");


        for (String firstEl : firstArray) {
            for (String secondEl : secondArray) {
                if (firstEl.equals(secondEl)) {
                    System.out.print(firstEl + " ");
                }
            }
        }
    }
}
