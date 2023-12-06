package FundFinalExamPrep;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stops = scanner.nextLine();
        String commands = scanner.nextLine();

        while (!commands.equals("Travel")) {
            String[] commandParts = commands.split(":");

            if (commandParts[0].equals("Add Stop")) {
                int index = Integer.parseInt(commandParts[1]);
                if (index >= 0 && index < stops.length()) {
                    String firstPart = stops.substring(0, index);
                    String secondPart = stops.substring(index);
//                    System.out.println(secondPart);
                    stops = firstPart + commandParts[2] + secondPart;
                }
                System.out.println(stops);

            } else if (commandParts[0].equals("Remove Stop")) {
                int startIndex = Integer.parseInt(commandParts[1]);
                int endIndex = Integer.parseInt(commandParts[2]);
                if (startIndex >= 0 && startIndex < stops.length()
                        && endIndex >= 0 && endIndex < stops.length()) {
                    String firstPart = stops.substring(0, startIndex);
                    String secondPart = stops.substring(endIndex+1);
                    stops = firstPart + secondPart;
                }
                System.out.println(stops);

            } else if (commandParts[0].equals("Switch")) {
                if (stops.contains(commandParts[1])) {
                    stops = stops.replaceAll(commandParts[1], commandParts[2]);
                }
                System.out.println(stops);

            }

            commands = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + stops);
    }
}
