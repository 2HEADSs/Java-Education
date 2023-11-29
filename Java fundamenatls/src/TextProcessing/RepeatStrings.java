package TextProcessing;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] words = scanner.nextLine().split("\\s+");
        for (String word : words) {
            System.out.print(repeat(word, words.length));
        }

    }

    private static String repeat(String word, int repetition) {
        char [] repeated = new char[word.length() * repetition];


        return new String(repeated);
    }
}
