package AssociativeArrays_Map_Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> items = new HashMap<>();
        Map<String, Integer> materials = new HashMap<>();

        boolean hasWinner = false;
        while (!hasWinner) {

            String[] data = scanner.nextLine().split("\\s+");
            for (int i = 0; i < data.length - 1; i++) {
                int quantity = Integer.parseInt(data[i]);
                String material = data[i + 1];
                
            }

        }

    }
}
