package PersonalPractiseMidExam;

import java.util.Scanner;

public class manOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] pirateShip = getNextIntArray(scanner, ">");
        int[] warShip = getNextIntArray(scanner, ">");
        int maxHealth = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Retire")){
                
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
