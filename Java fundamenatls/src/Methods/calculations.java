package Methods;

import java.util.Scanner;

public class calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());


        if (command.equals("add")) {
            add(firstNum,secondNum);
        } else if (command.equals("multiply")) {
            mult(firstNum,secondNum);
        } else if (command.equals("subtract")) {
            subs(firstNum,secondNum);
        } else if (command.equals("divide")) {
            divide(firstNum,secondNum);
        }
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }
    public static void mult(int a, int b) {
        System.out.println(a * b);
    }
    public static void subs(int a, int b) {
        System.out.println(a - b);
    }
    public static void divide(int a, int b) {
        System.out.println(a / b);
    }
}
