package ForLoopLab;

import java.util.Scanner;

public class characterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int textLength = text.length();

        for (int i = 0; i < textLength; i++) {
            System.out.println(text.charAt(i));
        }
    }
}
