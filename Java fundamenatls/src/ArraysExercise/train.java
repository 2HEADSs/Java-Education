package ArraysExercise;

import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countWagons = Integer.parseInt(scanner.nextLine());

        int[] train = new int[countWagons];

        int countPassenger = 0;
        for (int i = 0; i < train.length; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
            countPassenger += train[i];
        }
        for (int i = 0; i < train.length; i++) {
            System.out.print(train[i] +" ");
        }
        System.out.println();
        System.out.println(countPassenger);
//        add empty line before "countPassenger"
//        System.out.printf("\n%s", countPassenger);
    }
}
