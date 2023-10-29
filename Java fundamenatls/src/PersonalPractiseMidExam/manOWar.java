package PersonalPractiseMidExam;

import java.util.Scanner;

public class manOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] pirateShip = getNextIntArray(scanner, ">");
        int[] warShip = getNextIntArray(scanner, ">");
        int maxHealth = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Retire")){
            String[] commandAndParameter = command.split(" ");
            String typeOfCommand = commandAndParameter[0];
            switch (typeOfCommand){
                case "Fire":
                    int index= Integer.parseInt(commandAndParameter[1]);
                    int damage = Integer.parseInt(commandAndParameter[2]);
                    if(index>=0 && index < warShip.length){
                        warShip[index] -= damage;
                        if(warShip[index] <=0){
                            System.out.println("You won! The enemy ship has sunken.");
                            break;
                        }
                    }
                    break;
                    

            }

            command = scanner.nextLine();
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
