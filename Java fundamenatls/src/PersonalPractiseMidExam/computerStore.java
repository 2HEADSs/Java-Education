package PersonalPractiseMidExam;

import java.util.Scanner;

public class computerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double price = 0;
        while (!command.equals("special")) {
            if (command.equals("regular")) {
                break;
            }
            double partPrice = Double.parseDouble(command);
            if (partPrice < 0) {
                System.out.println("Invalid price!");
            } else {
                price += partPrice;
            }
            command = scanner.nextLine();
        }

        if (price == 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");

            System.out.printf("Price without taxes: %.2f$.%n", price);
            double taxes = price * 0.2;
            System.out.printf("Taxes: %.2f$.%n", price);
            price += taxes;

            if (command.equals("special")) {
                price *= 0.8;
            }
            System.out.println("-----------");

            System.out.printf("Total price: %.2f$.%n", price);


        }

    }
}
