package WhileLoop;

import java.util.Scanner;

public class sumNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (sum< firstNum){
            sum += Integer.parseInt(scanner.nextLine());
        }
        System.out.println(sum);
    }
}
