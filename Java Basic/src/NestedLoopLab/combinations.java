package NestedLoopLab;

import java.util.Scanner;

public class combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int count = 0;

        for(int i = 1; i<=n; i++){
            for(int j = 1; j <=n; j++){
                for (int k = 0; k <=n; k++){
                    int sum = i+j+k;

                    if(sum == n){
                        count++;
                    }
                }

            }
        }
        System.out.println(count);
    }
}
