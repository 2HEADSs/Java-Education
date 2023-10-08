package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = nextLineOfDoubles(scanner);

//        for (double number : numbers) {
//            System.out.println(number);
//        }


    }


    private static List<Double> nextLineOfDoubles(Scanner scanner) {
        List<Double> numbers = new ArrayList<>();
        String lineOfNumbers = scanner.nextLine();
        String[] numbersAsString = lineOfNumbers.split(" ");
        for (String s : numbersAsString) {
            numbers.add(Double.parseDouble(s));
        }
        return numbers;
    };
}
