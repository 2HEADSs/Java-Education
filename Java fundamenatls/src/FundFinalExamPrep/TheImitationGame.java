package FundFinalExamPrep;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        String commands = scanner.nextLine();

        while (!commands.equals("Decode")) {


            commands = scanner.nextLine();
        }

    }
}
