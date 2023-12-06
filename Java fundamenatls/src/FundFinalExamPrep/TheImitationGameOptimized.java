package FundFinalExamPrep;

import java.util.Scanner;

public class TheImitationGameOptimized {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder message = new StringBuilder(scanner.nextLine());
        String commands = scanner.nextLine();

        while (!commands.equals("Decode")) {
            String[] commandParts = commands.split("\\|");
            String commandName = commandParts[0];
            switch (commandName) {
                case "Move":
                    move(message, Integer.parseInt(commandParts[1]));
                    break;
                case "Insert":
                    insert(message, Integer.parseInt(commandParts[1]), commandParts[2]);
                    break;
                case "ChangeAll":
                    changeAll(message, commandParts[1], commandParts[2]);
                    break;
                default:
                    throw new IllegalStateException("Unknown command " + commandName);
            }
            commands = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + message);
    }

    private static void changeAll(StringBuilder message, String subst, String replacement) {
         message.toString().replaceAll(subst, replacement);
    }

    private static void insert(StringBuilder message, int i, String insertChar) {
        message.insert(i, insertChar);
    }

    private static void move(StringBuilder message, int length) {
        String firstPart = message.substring(0, length);
        message.replace(0, length, "");
        message.append(firstPart);
    }
}
