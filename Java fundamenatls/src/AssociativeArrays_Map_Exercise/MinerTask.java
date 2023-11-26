package AssociativeArrays_Map_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resources = new LinkedHashMap<>();
        String line = scanner.nextLine();

        while (!line.equals("stop")) {
            String resource = line;
            Integer quantity = Integer.parseInt(scanner.nextLine());
            if (!resources.containsKey(resource)) {
                resources.put(resource, quantity);
            } else {
                resources.put(resource, resources.get(resource) + quantity);
            }
            line = scanner.nextLine();
        }

        for(String key: resources.keySet()){
            System.out.printf("%s -> %d%n", key, resources.get(key));
        }
    }
}
