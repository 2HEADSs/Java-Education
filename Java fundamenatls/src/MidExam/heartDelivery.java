package MidExam;

import java.util.Scanner;

public class heartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] houses  = getNextIntArray(scanner, "@");
        String command = scanner.nextLine();

        while(command.equals("Love!")){

        }
    }

    private static int[] getNextIntArray(Scanner scanner, String separator) {
        String[] intAsStrings = scanner.nextLine().split("@");
        int[] array = new int[intAsStrings.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(intAsStrings[i]);
        }
        return array;
    }


}
