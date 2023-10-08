package Methods;

import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        switch (product) {
            case "cofee":
                coffe(count);
                break;
            case "water":
                water(count);
                break;
            case "coke":
                coke(count);
                break;
            case "snack":
                snack(count);
                break;
        }

    }

    public static void coffe(int count) {

        System.out.printf("%.2f", count * 1.50);
    }

    public static void water(int count) {
        System.out.printf("%.2f", count * 1.00);
    }

    public static void coke(int count) {
        System.out.printf("%.2f", count * 1.40);
    }

    public static void snack(int count) {
        System.out.printf("%.2f", count * 2.00);
    }
}
