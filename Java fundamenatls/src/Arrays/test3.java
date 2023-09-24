package Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lineOfNumber = scanner.nextLine();

        String[] numberAsString = lineOfNumber.split("\\s+");

        int[] numbers = new int[numberAsString.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numberAsString[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("------------------------");
        for (int i = 0; i < numbers.length / 2; i++) {
            int otherIndex = numbers.length - 1 - i;
            int currentNum =  numbers[i];
            numbers[i] = numbers[otherIndex];
            numbers[otherIndex] = currentNum;

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
    }
}
