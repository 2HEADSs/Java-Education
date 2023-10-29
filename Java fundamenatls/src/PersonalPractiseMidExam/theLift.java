package PersonalPractiseMidExam;

import java.util.Scanner;

public class theLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waitingPeople = Integer.parseInt(scanner.nextLine());
        int[] wagons = getNextIntArray(scanner, " ");
        int limit = 4;

        for (int i = 0; i < wagons.length; i++) {
            if (waitingPeople <= 0) {
                break;
            }
            int currentWagon = wagons[i];
            if (currentWagon < limit) {
                int difference = limit - currentWagon;
                if (difference > waitingPeople) {
                    currentWagon += waitingPeople;
                    wagons[i] = currentWagon;
                    waitingPeople = 0;
                    break;
                } else {
                    currentWagon += difference;
                    waitingPeople -= difference;
                    wagons[i] = currentWagon;
                }
            }
        }
        boolean freeWagons = false;

        if (waitingPeople == 0) {
            for (int i = 0; i < wagons.length; i++) {
                if (wagons[i] != 4) {
                    freeWagons = true;
                    System.out.println("The lift has empty spots!");
                    printArray(wagons, " ");
                    break;

                }
            }
        } else {
            System.out.printf("There isn't enough space! %d people in a queue!%n", waitingPeople);

            printArray(wagons, " ");
        }
    }

    private static void printArray(int[] array, String separator) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(" ");
            }
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
