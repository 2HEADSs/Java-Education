package AssociativeArrays_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class demo {
    public static void main(String[] args) {
        Map<Integer, String> classification = new TreeMap<>();
        classification.put(1, "Ivan Dimitrov");
        classification.put(2, "Stefan Georgiev");
        classification.put(3, "Joro Gavazov");
        System.out.println(classification.get(2));
        classification.put(2, "Peter Dimitrov");
        System.out.println(classification.get(2));

        String winner = classification.get(1);
        System.out.println(winner);
        classification.put(4, "Panayot Kocev");
        String removedEement = classification.remove(4);
        System.out.println(removedEement);

        //to have same first names
        classification.put(4, "Joro konstantinov");
        classification.put(5, "Maria Pyrvanova");
        classification.put(4, "Kalin Kostov");

        for (Map.Entry<Integer, String> entry : classification.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}
