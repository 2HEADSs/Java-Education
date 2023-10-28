package MidExam;

import java.util.Scanner;

public class heartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] targets = getNextIntArray(scanner);
        System.out.println(targets);
    }

    private static int[] getNextIntArray(Scanner scanner) {
        String[] intAsStrings = scanner.nextLine().split("@");
        int[] array = new int[intAsStrings.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(intAsStrings[i]);
        }
        return array;
    }


}
