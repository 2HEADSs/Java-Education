package conditionalStatementsAdvancedLab;

import java.util.Scanner;

public class invalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        boolean isValid = num == 0 || (num >=100 && num<=200);
        if(!isValid){
            System.out.println("invalid");
        }
    }
}
