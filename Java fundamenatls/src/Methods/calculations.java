package Methods;

import java.util.Scanner;

public class calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int result = 0;


        if (command.equals("add")) {
            result = add(firstNum, secondNum);
        } else if (command.equals("multiply")) {
            result = mult(firstNum, secondNum);
        } else if (command.equals("subtract")) {
            result = subs(firstNum, secondNum);
        } else if (command.equals("divide")) {
            result = divide(firstNum, secondNum);
        }
        System.out.println(result);
    }

    public static int add(int a, int b) {
//        System.out.println(a + b);
        return (a + b);
    }

    public static int mult(int a, int b) {
//        System.out.println(a * b);
        return (a * b);
    }

    public static int subs(int a, int b) {
//        System.out.println(a * b);
        return (a - b);
    }

    public static int divide(int a, int b) {
//        System.out.println(a * b);
        return (a / b);
    }
}
