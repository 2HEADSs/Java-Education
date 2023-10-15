package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class bombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] data = scanner.nextLine().split("\\s+");
        int bomb = Integer.parseInt(data[0]);
        int power = Integer.parseInt(data[1]);
    }
}
