package AssociativeArrays_Map;

import java.util.*;

public class DemoTask {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "bye",
                "the", "quick", "brown", "fox", "jumps",
                "over", "the", "lazy", "dog");

        Map<Integer, List<String>> wordsByLength = new TreeMap<>();
        for (String word : words) {
            int key = word.length();
            List<String> values = wordsByLength.get(key);
            if(values != null){
                values.add(word);
            } else {
                values = new ArrayList<>();
                wordsByLength.put(key,values);
                values.add(word);
            }
        }

    }
}
