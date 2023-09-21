package DataTypesAndVariablesLab;


import java.util.Scanner;

public class ConvertMetersToKilometers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meters = scanner.nextInt();

        double km = meters / 1000.0;
        System.out.println(km);
    }
}
