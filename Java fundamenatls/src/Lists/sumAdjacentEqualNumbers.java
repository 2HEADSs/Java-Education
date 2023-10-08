package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = nextLineOfDoubles(scanner);

        List<Double> nextNumbers = sumAdjacentNumbers(numbers);
        while (nextNumbers.size() != numbers.size()) {
            numbers = nextNumbers;
            nextNumbers = sumAdjacentNumbers(numbers);
        }

        for (double number : numbers) {
            System.out.println(number);
        }


    }

    private static List<Double> sumAdjacentNumbers(List<Double> numbers) {
        List<Double> nextNums = new ArrayList<>();
        int i = 0;
        while (i < numbers.size()) {

            if (i < nextNums.size() - 1 && numbers.get(i) == numbers.get(i++)) {
                nextNums.add(numbers.get(i) + numbers.get(i++));
                i += 2;
            } else {
                nextNums.add(numbers.get(i));
                i++;
            }
        }
        return nextNums;
    }


    private static List<Double> nextLineOfDoubles(Scanner scanner) {
        List<Double> numbers = new ArrayList<>();
        String lineOfNumbers = scanner.nextLine();
        String[] numbersAsString = lineOfNumbers.split(" ");
        for (String s : numbersAsString) {
            numbers.add(Double.parseDouble(s));
        }
        return numbers;
    }

    ;
}
