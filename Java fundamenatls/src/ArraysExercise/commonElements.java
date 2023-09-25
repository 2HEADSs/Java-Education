package ArraysExercise;

import java.util.Scanner;

public class commonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();

        String[] firstArray = firstLine.split(" ");
        String[] secondArray = secondLine.split(" ");


        for (String firstEl : firstArray) {
            for (String secondEl : secondArray) {
                if (firstEl.equals(secondEl)) {
                    System.out.print(firstEl + " ");
                }
            }
        }
    }
}
