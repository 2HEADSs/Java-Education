package Methods;

import java.util.Scanner;

public class signOfIntegerNumbers {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        printSign(number);
    }

    private static void printSign(int number) {
        if(number >= 0){
            System.out.println("The number " + number + " is positive");
        } else  {
            System.out.println("The number " + number + " is negative");

        }
    }

    private static void  printArray(int [] numbers){
        for(int number: numbers){
            System.out.print(number + " ");
        }
    }
}
