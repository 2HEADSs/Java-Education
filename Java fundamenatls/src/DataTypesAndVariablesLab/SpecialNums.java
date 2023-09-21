package DataTypesAndVariablesLab;

import java.util.Scanner;

public class SpecialNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(input);


        for (int i = 0; i < n; i++) {
            int number = i;
            int sum = 0;
            while (number > 0) {
                //take the last symbol 123 % 10 = 3 (INTEGER)
                int digit = number % 10;

                sum += digit;
                //remove last symbol 123/10 = 12 (INTEGER)
                number /= 10;
            }
            if(sum == 5 || sum == 11 || sum == 7 ){
                System.out.println(i + " -> True" );
            } else {
                System.out.printf("%d -> False" , i);
            }

        }

    }

}
