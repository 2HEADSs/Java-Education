import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double allArea = Double.parseDouble(scanner.nextLine());

        double pricePerSquare = 7.61;
        double totalSum = allArea * pricePerSquare;

        double discount = totalSum * 0.18;
        double sumWithDiscount = totalSum - discount;

        System.out.printf("The final price is: %.2f lv.%n", sumWithDiscount);
        System.out.printf("The discount is: %.2f lv.%n", discount);

    }
}
