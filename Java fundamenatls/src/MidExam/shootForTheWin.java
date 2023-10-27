package MidExam;

import java.util.Scanner;

public class shootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] target = getNextIntArray(scanner);

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            command = scanner.nextLine();
        }
    }

    private static int[] getNextIntArray(Scanner scanner) {


        return new int[0];
    }

}
