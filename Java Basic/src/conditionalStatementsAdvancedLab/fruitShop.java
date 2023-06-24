package conditionalStatementsAdvancedLab;

import java.util.Scanner;

public class fruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;

        boolean isWorkingDay = dayOfWeek.equals("Monday")
                ||dayOfWeek.equals("Tuesday")
                ||dayOfWeek.equals("Wednesday")
                ||dayOfWeek.equals("Thursday")
                ||dayOfWeek.equals("Friday");

        boolean isWeekend = dayOfWeek.equals("Saturday") ||dayOfWeek.equals("Sunday");


        if(isWorkingDay){
            switch (fruit){
                case "banana":
                    price = 2.5;
                    break;
                case "apple":
                    price = 1.2;
                    break;
                case "orange":
                    price = 0.85;
                    break;
                case "grapefruit":
                    price = 1.45;
                    break;
                case "kiwi":
                    price = 2.70;
                    break;
                case "pineapple":
                    price = 5.50;
                    break;
                case "grapes":
                    price = 3.85;
                    break;
            }
            System.out.printf( "%.2f",quantity * price);
        } else  if(isWeekend){
            switch (fruit){
                case "banana":
                    price = 7;
                    break;
                case "apple":
                    price = 1.25;
                    break;
                case "orange":
                    price = 0.90;
                    break;
                case "grapefruit":
                    price = 1.60;
                    break;
                case "kiwi":
                    price = 3;
                    break;
                case "pineapple":
                    price = 5.60;
                    break;
                case "grapes":
                    price = 4.20;
                    break;
            }
            System.out.printf( "%.2f",quantity * price);
        } else  {
            System.out.println("error");
        }
    }
}
