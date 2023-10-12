package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = nextLineOfDoubles(scanner);

        List<Integer> nextNumbers = sumAdjacentNumbers(numbers);
        while (nextNumbers.size() != numbers.size()) {
            numbers = nextNumbers;
            nextNumbers = sumAdjacentNumbers(numbers);
        }

        //TODO print as documents

//        for(int i = 0; i < numbers.size(); i ++){
//            System.out.print(numbers.get(i)+ " ");
//        };

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        ;


    }

    private static List<Integer> sumAdjacentNumbers(List<Integer> numbers) {
        List<Integer> nextNums = new ArrayList<>();
        int i = 0;
        while (i < numbers.size()) {
            int first = numbers.get(i);
//            double second = numbers.get(i + 1);

            if (i < numbers.size() - 1 && numbers.get(i).equals(numbers.get(i + 1))) {
                nextNums.add(numbers.get(i) + numbers.get(i + 1));
                i += 2;
            } else {
                nextNums.add(numbers.get(i));
                i++;
            }
        }
        return nextNums;
    }


    private static List<Integer> nextLineOfDoubles(Scanner scanner) {
        List<Integer> numbers = new ArrayList<>();
        String lineOfNumbers = scanner.nextLine();
        String[] numbersAsString = lineOfNumbers.split(" ");
        for (String s : numbersAsString) {
            numbers.add(Integer.parseInt(s));
        }
        return numbers;
    }


}
