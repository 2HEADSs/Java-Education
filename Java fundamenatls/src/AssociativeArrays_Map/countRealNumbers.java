package AssociativeArrays_Map;

import java.lang.reflect.Array;
import java.util.*;

public class countRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> numberCounts = new TreeMap<>();
        for (double number : numbers) {
            Integer currentCount = numberCounts.get(number);
            if (currentCount != null) {
                numberCounts.put(number, currentCount + 1);
            } else {
                numberCounts.put(number, 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : numberCounts.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }

}
