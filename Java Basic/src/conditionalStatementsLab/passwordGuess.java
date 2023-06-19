package conditionalStatementsLab;

import java.util.Scanner;

public class passwordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pass = "s3cr3t!P@ssw0rd";
        String input = scanner.nextLine();

        if (input  === pass) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }

    }
}
