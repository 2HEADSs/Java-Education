package Methods;

import java.util.Scanner;

public class repeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repetitions = Integer.parseInt(scanner.nextLine());

        String s = scanner.nextLine();

        String repeated = repeatedString(s, repetitions);

        System.out.println(repeated);
    }

    private static String repeatedString(String s, int repetitions) {
        String[] strings = new String[repetitions];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = s;
        }
        String repeated = String.join("", strings);
        return repeated;
    }

    ;
}
