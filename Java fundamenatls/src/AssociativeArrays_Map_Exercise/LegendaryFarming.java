package AssociativeArrays_Map_Exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards",0);
        materials.put("fragments",0);
        materials.put("motes",0);
        Map<String, String> items = new HashMap<>();
        items.put("shards", "Shadowmourne obtained!");
        items.put("fragments", "Valanyr obtained!");
        items.put("motes", "Dragonwrath obtained!");
        String winner = "";
        boolean hasWinner = false;
        while (!hasWinner) {
            String[] data = scanner.nextLine().split("\\s+");
            for (int i = 0; i < data.length - 1; i += 2) {
                int quantity = Integer.parseInt(data[i]);
                String material = data[i + 1].toLowerCase();

                materials.putIfAbsent(material, 0);
                materials.put(material, materials.get(material) + quantity);

                if (material.equals("shards")
                        || material.equals("fragments")
                        || material.equals("motes")) {
                    if (materials.get(material) >= 250) {

                        materials.put(material, materials.get(material) - 250);
                        winner = material;
                        hasWinner = true;
                        break;
                    }
                }
            }
        }
        System.out.println(items.get(winner));

        materials.forEach((k,v)-> System.out.printf("%s: %d%n",k,v));

    }
}
