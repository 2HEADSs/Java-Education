package TextProcessing;

import java.util.Scanner;

public class Substring2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String keyWord = scanner.nextLine();
        String text = scanner.nextLine();
        int index = text.indexOf(keyWord);
        while (index != -1) {
            text = text.replace(keyWord, "");
        }
        System.out.println(text);
    }
}
