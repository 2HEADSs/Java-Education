package AssociativeArrays_Map_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split(" ");
        Map<Character, Integer> result = new LinkedHashMap<>();
        for (String singleString : text) {
            for (int i = 0; i < singleString.length(); i++) {
                char symbol = singleString.charAt(i);
                if (!result.containsKey(symbol)) {
                    result.put(symbol, 1);
                } else {
                    result.put(symbol, result.get(symbol) + 1);
                }
            }
        }
        System.out.println(result);
    }
}
