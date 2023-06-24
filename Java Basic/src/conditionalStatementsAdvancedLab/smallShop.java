package conditionalStatementsAdvancedLab;

import java.util.Scanner;

public class smallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());

        if(town.equals("Sofia")){
            if(product.equals("coffee")){

            } else  if(product.equals("water")){

            } else  if(product.equals("beer")){

            }else  if(product.equals("sweets")){

            }else  if(product.equals("peanuts")){

            }
        } else  if(town.equals("Plovdiv")){
            if(age >=16){
                System.out.println("Ms.");

            } else  if(age < 16){
                System.out.println("Miss");
            }
        } else  if(town.equals("Varna")){
            if(age >=16){
                System.out.println("Ms.");

            } else  if(age < 16){
                System.out.println("Miss");
            }
        }

    }
}
