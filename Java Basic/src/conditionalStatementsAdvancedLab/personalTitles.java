package conditionalStatementsAdvancedLab;

import java.util.Scanner;

public class personalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String gender = scanner.nextLine();
        double age = Double.parseDouble(scanner.nextLine());

        if(gender.equals("m")){
            if(age >=16){
                System.out.println("Mr.");

            } else  if(age < 16){
                System.out.println("Master");
            }
        } else  if(gender.equals("f")){
            if(age >=16){
                System.out.println("Ms.");

            } else  if(age < 16){
                System.out.println("Miss");
            }
        }

    }
}
