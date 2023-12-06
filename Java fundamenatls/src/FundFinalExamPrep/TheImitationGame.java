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
                    message = move(message, Integer.parseInt(commandParts[1]));
                    break;
                case "Insert":
                    message = insert(message, Integer.parseInt(commandParts[1]), commandParts[2]);
                    break;
                case "ChangeAll":
                    message = changeAll(message, commandParts);
                    break;
                default:
                    throw new IllegalStateException("Unknown command " + commandName);
            }


            commands = scanner.nextLine();
        }

        System.out.println("The decrypted message is: " + message);

    }

    private static String changeAll(String message, String[] commandParts) {
        message = message.replaceAll(commandParts[1], commandParts[2]);
        return message;
    }

    private static String insert(String message, int i, String insertChar) {
        String firstPart = message.substring(0, i);
        String secondPart = message.substring(i);


        return firstPart + insertChar + secondPart;
    }

    private static String move(String message, int length) {
        String firstPart = message.substring(0, length);
        String secondPart = message.substring(length);

        return secondPart + firstPart;
    }
}
