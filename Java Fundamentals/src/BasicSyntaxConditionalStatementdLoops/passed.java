package BasicSyntaxConditionalStatementdLoops;

import java.util.Scanner;

public class passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = scanner.nextDouble();

        if (grade >=3.00){
            System.out.println("Passed!");
        }
    }
}
