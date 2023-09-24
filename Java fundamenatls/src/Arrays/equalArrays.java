package Arrays;

import java.util.Scanner;

public class equalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNums = scanner.nextLine();
        String secondNums = scanner.nextLine();
        String[] firstArray = firstNums.split(" ");
        String[] secondArray = secondNums.split(" ");

        boolean areIdentical = true;
        int sum = 0;

        for (int i = 0; i < firstArray.length - 1; i++) {

            if(Integer.parseInt(firstArray[i]) == Integer.parseInt(secondArray[i])){
                sum += (Integer.parseInt(firstArray[i]) + Integer.parseInt(secondArray[i]));
            } else {
                areIdentical = false;
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            }
        }
        if(areIdentical){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }

    }
}

