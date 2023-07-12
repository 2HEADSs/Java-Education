package BasicSyntaxConditionalStatementdLoops;

import java.util.Scanner;

public class theatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = scanner.nextInt();
        int price = 0;
        boolean error = false;


        switch (day) {

            case "Weekday":
                if (age <= 0) {
                    error = true;
                    break;
                }
                if (age <= 18) {
                    price = 12;
                } else if (age <= 64) {
                    price = 18;
                } else if (age <= 122) {
                    price = 12;
                }
                break;
            case "Weekend":
                if (age <= 0) {
                    error = true;
                    break;
                }
                if (age <= 18) {
                    price = 15;
                } else if (age <= 64) {
                    price = 20;
                } else if (age <= 122) {
                    price = 15;
                }
                break;
            case "Holiday":
                if (age <= 0) {
                    error = true;
                    break;
                }
                if (age <= 18) {
                    price = 5;
                } else if (age <= 64) {
                    price = 12;
                } else if (age <= 122) {
                    price = 10;
                }
                break;
        }

        if (!error) {
            System.out.printf("%d$", price);
        } else {
            System.out.println("Error!");
        }
    }
}
