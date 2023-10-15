package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine()
                .split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(wagons);
    }
}
