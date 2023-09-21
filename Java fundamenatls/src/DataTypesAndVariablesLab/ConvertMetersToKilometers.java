package DataTypesAndVariablesLab;


import java.util.Scanner;

public class ConvertMetersToKilometers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meters = scanner.nextInt();
//        int metersPerKilometer = 1000;

        double km = meters / 1000.0;
//        double km = meters / (double)metersPerKilometer;
        System.out.println(km);
    }
}
