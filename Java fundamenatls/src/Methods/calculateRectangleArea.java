package Methods;

import java.util.Scanner;

public class calculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        System.out.printf("%.0f", result(width, height));
    }

    public static double result(double w, double h) {
        return w * h;
    };

};
