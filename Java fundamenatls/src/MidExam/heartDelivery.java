package MidExam;

import java.util.Scanner;

public class heartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] houses  = getNextIntArray(scanner, "@");
        int currentPosition = 0;
        String command = scanner.nextLine();

        while(!command.equals("Love!")){

            command = scanner.nextLine();
        }
        int failed = 0;
        for (int i = 0; i < houses.length; i++) {
            if(houses[i] !=0){
                failed++;
            }
        }
        System.out.printf("Cupid's last position was %d.%n", currentPosition);
        System.out.printf("Cupid has failed %d places.%n", failed);
        System.out.println("Mission was successful.");
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
