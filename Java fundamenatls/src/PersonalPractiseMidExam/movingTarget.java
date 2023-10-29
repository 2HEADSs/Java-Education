package PersonalPractiseMidExam;

import java.util.Scanner;

public class movingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] targets = getNextIntArray(scanner, " ");
        String[] comandAray = scanner.nextLine().split(" ");

        while (!comandAray[0].equals("End")){
            String command = comandAray[0];
            int index = Integer.parseInt(comandAray[1]);
            int secondParam = Integer.parseInt(comandAray[2]);

        }


    }


    private static int[] getNextIntArray(Scanner scanner, String separator) {
        String[] intAsString = scanner.nextLine().split(separator);
        int[] array = new int[intAsString.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(intAsString[i]);
        }
        return array;
    }
}
