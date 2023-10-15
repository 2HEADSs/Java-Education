package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class houseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCommands = Integer.parseInt(scanner.nextLine());

        List<String> guests = new ArrayList<>();

        for (int i = 0; i < countCommands; i++) {
            String command = scanner.nextLine();
            String[] data = command.split("\\s+");
            String name = data[0];
            if (!command.contains("not")) {
                if (guests.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    guests.add(name);
                }
            } else {
                if (guests.contains(name)) {
                    guests.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);

                }
            }
        }
        print(guests);
    }

    private static void print(List<String> guests) {
        guests.forEach(guest -> System.out.println(guest));
    }
}
