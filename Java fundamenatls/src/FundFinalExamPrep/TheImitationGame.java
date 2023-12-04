package FundFinalExamPrep;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        String commands = scanner.nextLine();

        while (!commands.equals("Decode")) {
            String[] commandParts = commands.split("\\|");
            String commandName = commandParts[0];
            switch (commandName) {
                case "Move":

                    break;
                case "Insert":

                    break;
                case "ChangeAll":

                    break;
                default:
                    throw  new IllegalStateException("Unknown command " + commandName);
            }


            commands = scanner.nextLine();
        }

        System.out.println("The decrypted message is: " + message);

    }
}
