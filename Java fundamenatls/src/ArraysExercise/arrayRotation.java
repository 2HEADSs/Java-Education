package ArraysExercise;

import java.util.Scanner;

public class arrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split(" ");
        int cycles = scanner.nextInt();

        for (int i = 0; i < cycles; i++) {
            String firstEl = input[0];
            for(int j = 0; j <input.length -1; j++){;
                    input[j] = input[j+1] ;
            };
            input[input.length-1] = firstEl;
        }
        System.out.println(String.join(" ", input));
    }
}
