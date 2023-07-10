package BasicSyntaxConditionalStatementdLoops;

import java.util.Scanner;

public class monthPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mont = Integer.parseInt(scanner.nextLine());

        switch (mont){
            case 1:
                System.out.println("");
                break;
            case 2:
                System.out.println("");
                break;
            case 3:
                System.out.println("");
                break;
            case 4:
                System.out.println("January");
                break;
            case 5:
                System.out.println("February");
                break;
            case 6:
                System.out.println("");
                break;
            case 7:
                System.out.println("");
                break;
            case 8:
                System.out.println("");
                break;
            case 9:
                System.out.println("");
                break;
            case 10:
                System.out.println("");
                break;
            case 11:
                System.out.println("");
                break;
            case 12:
                System.out.println("");
                break;
            default:
                System.out.println("");
                break;
        }
    }
}
