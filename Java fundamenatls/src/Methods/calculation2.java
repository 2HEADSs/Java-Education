package Methods;

import java.util.Scanner;

public class calculation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int result = 0;


        if (command.equals("add")) {
            result = firstNum + secondNum;
        } else if (command.equals("multiply")) {
            result = firstNum * secondNum;
        } else if (command.equals("subtract")) {
            result = firstNum - secondNum;
        } else if (command.equals("divide")) {
            result = firstNum / secondNum;
        }
        System.out.println(result);
    }
}
