package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNum = Double.parseDouble(scanner.nextLine());
        double secondNum = Double.parseDouble(scanner.nextLine());
        System.out.println(new DecimalFormat("0.####").format(output(firstNum,secondNum)));

    }

    public static double output(double a, double b) {
        double result = a;
        for (int i = 1; i < b; i++) {
            result *= a;
        }
        return result;
    };
}
