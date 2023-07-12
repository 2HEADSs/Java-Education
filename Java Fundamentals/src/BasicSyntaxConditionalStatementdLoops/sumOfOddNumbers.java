package BasicSyntaxConditionalStatementdLoops;

import java.util.Scanner;

public class sumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNum = scanner.nextInt();
        int num = 1;
        int sum = 0;

        for (int i = 1; i <= countNum; i++) {
            System.out.println(num);
            sum += num;
            num += 2;
        }
        System.out.printf("Sum: %d", sum);
    }
}
