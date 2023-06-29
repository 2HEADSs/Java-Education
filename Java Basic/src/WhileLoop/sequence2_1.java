package WhileLoop;

import java.util.Scanner;

public class sequence2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int initialNumber = 1;
        while (num >= initialNumber){
        System.out.println(initialNumber);
        initialNumber = initialNumber * 2 + 1;
        }
    }
}
