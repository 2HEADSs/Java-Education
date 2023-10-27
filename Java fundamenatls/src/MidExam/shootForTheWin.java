package MidExam;

import java.util.Scanner;

public class shootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] targets = getNextIntArray(scanner);
        String command = scanner.nextLine();
        int totalShot = 0;

        while (!command.equals("End")) {
            int targetIndex =  Integer.parseInt(command);

            if(isValidIndex(targets, targetIndex)){

            }

            command = scanner.nextLine();
        }

        System.out.printf("Shot targets %d -> ", totalShot);

        printArray(targets, " ");

    }

    private static boolean isValidIndex(int[] targets, int targetIndex) {
        return targetIndex > 0 && targetIndex < targets.length;
    }

    private static void printArray(int[] array, String separator) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(" ");
            }
        }
    }

    private static int[] getNextIntArray(Scanner scanner) {
        String [] intAsStrings =  scanner.nextLine().split("\\s+");
        int [] array = new int [intAsStrings.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(intAsStrings[i]);
        }
        return array;
    }

}
