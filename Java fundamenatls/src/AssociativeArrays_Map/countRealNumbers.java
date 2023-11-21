package AssociativeArrays_Map;

import java.lang.reflect.Array;
import java.util.*;

public class countRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> numberCounts = new HashMap<>();
        for (double number : numbers) {
                
        }


    }

}
