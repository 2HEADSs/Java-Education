import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inputInch = Double.parseDouble(scanner.nextLine());

        double cm = inputInch * 2.54;
        System.out.println(cm);
    }
}
