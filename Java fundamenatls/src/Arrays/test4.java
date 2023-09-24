package Arrays;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] chars = line.split(" ");
        for (int i = 0; i < line.length()-1; i++) {
            System.out.println(chars[i]);
        }
    }
}
