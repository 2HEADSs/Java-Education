package TextProcessing;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String keyWord = scanner.nextLine();
        String text = scanner.nextLine();
        int index = text.indexOf(keyWord);
        while (index != -1) {
            String firstPart = text.substring(0, index);
            String secondPart = text.substring(index + keyWord.length());
            text = firstPart + secondPart;
            index = text.indexOf(keyWord);
        }
        System.out.println(text);
    }
}
