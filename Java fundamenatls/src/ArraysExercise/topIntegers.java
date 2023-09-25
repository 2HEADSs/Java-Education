package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class topIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            if (i == nums.length) {
                System.out.print(currentNum + " ");
                break;
            }
            boolean isMax = false;
            for (int j = i + 1; j < nums.length; j++) {
                if (currentNum > nums[j]) {
                    isMax = true;
                } else {
                    isMax = false;
                }
            }
            if (isMax) {
                System.out.print(currentNum + " ");
            }
        }

    }
}