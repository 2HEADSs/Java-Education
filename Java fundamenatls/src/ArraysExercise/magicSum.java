package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class magicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i<numbers.length; i ++){;

            int firstNum = numbers[i];

            for(int j = i+1; j<numbers.length; j++){
                int secondNum = numbers[j];
                if(firstNum + secondNum == magicSum){
                    System.out.println(firstNum + " " + secondNum);
                }
            }
        };


    }
}
