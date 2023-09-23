package DataTypesAndVariablesMoreExersice;

import java.util.Scanner;

public class dataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String type = "";
            if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                type = "boolean";
            } else if (input.length() == 1) {
                char symbol = input.charAt(0);
                if(symbol < 47 || symbol >58){
                    type = "character";
                }
                else {
                    type = "integer";
                }
            } else {
                boolean isString = false;
                boolean isFloat = false;
                for (int i = 0; i < input.length(); i++) {
                    char currentSymbol = input.charAt(i);

                    if(currentSymbol < 47 || currentSymbol >58) {
                        isString = true;
                    }
                    if(currentSymbol == 46){
                        isFloat = true;
                    }
                }
            }
            input = scanner.nextLine();

        }

    }
}
