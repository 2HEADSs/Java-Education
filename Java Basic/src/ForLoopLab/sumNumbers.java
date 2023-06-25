package ForLoopLab;

import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Integer.parseInt(scanner.nextLine());
        }
        System.out.println(sum);
    }
}
