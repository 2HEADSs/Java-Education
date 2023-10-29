package PersonalPractiseMidExam;

import java.util.Scanner;

public class manOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] pirateShip = getNextIntArray(scanner, ">");
        int[] warShip = getNextIntArray(scanner, ">");
        int maxHealth = Integer.parseInt(scanner.nextLine());
        double minimumHealth = maxHealth * 0.2;
        boolean pirateHasSunk = false;
        boolean warHasSunk = false;
        String command = scanner.nextLine();

        while (!command.equals("Retire")) {
            String[] commandAndParameter = command.split(" ");
            String typeOfCommand = commandAndParameter[0];
            switch (typeOfCommand) {
                case "Fire":
                    int index = Integer.parseInt(commandAndParameter[1]);
                    int damageWarShip = Integer.parseInt(commandAndParameter[2]);
                    if (index >= 0 && index < warShip.length) {
                        warShip[index] -= damageWarShip;
                        if (warShip[index] <= 0) {
                            System.out.println("You won! The enemy ship has sunken.");
                            warHasSunk = true;
                            break;
                        }
                    }
                    break;
                case "Defend":
                    int startIndex = Integer.parseInt(commandAndParameter[1]);
                    int endIndex = Integer.parseInt(commandAndParameter[2]);
                    int damagePirateShip = Integer.parseInt(commandAndParameter[3]);

                    if ((startIndex >= 0 && startIndex < pirateShip.length) && (endIndex >= 0 && endIndex < pirateShip.length)) {
                        for (int i = startIndex; i <= endIndex; i++) {
                            pirateShip[i] -= damagePirateShip;
                            if (pirateShip[i] <= 0) {
                                System.out.println("You lost! The pirate ship has sunken.");
                                pirateHasSunk = true;
                                break;
                            }
                        }
                    }
                    break;
                case "Repair":
                    int repairIndexSection = Integer.parseInt(commandAndParameter[1]);
                    int repairhealth = Integer.parseInt(commandAndParameter[2]);
                    if (repairIndexSection >= 0 || repairIndexSection < pirateShip.length) {
                        pirateShip[repairIndexSection] += repairhealth;
                        if (pirateShip[repairIndexSection] > maxHealth) {
                            pirateShip[repairIndexSection] = maxHealth;
                        }
                    }
                    break;
                case "Status":
                    int countSectionForRepair = 0;
                    for (int i = 0; i < pirateShip.length; i++) {
                        if (pirateShip[i] < minimumHealth) {
                            countSectionForRepair++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n", countSectionForRepair);
                    break;
            }

            if (warHasSunk == true || pirateHasSunk == true) {
                break;
            }
            command = scanner.nextLine();
        }
        if(!warHasSunk &&  !pirateHasSunk){
            int pirateShipStatus = 0;
            int warShipStatus = 0;
            for (int i = 0; i < pirateShip.length; i++) {
                pirateShipStatus+=pirateShip[i];
            }
            for (int i = 0; i < warShip.length; i++) {
                warShipStatus+=warShip[i];
            }
            System.out.printf("Pirate ship status: %d%n", pirateShipStatus);
            System.out.printf("Warship status: %d%n", warShipStatus);

        }


    }


    private static int[] getNextIntArray(Scanner scanner, String separator) {
        String[] intAsString = scanner.nextLine().split(separator);
        int[] array = new int[intAsString.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(intAsString[i]);
        }
        return array;
    }
}
