package conditionalStatementsLab;

import java.util.Scanner;

public class excellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grade = Integer.parseInt(scanner.nextLine());

        if (grade >=5){
            System.out.println("Excellent!");
        }
    }
}
