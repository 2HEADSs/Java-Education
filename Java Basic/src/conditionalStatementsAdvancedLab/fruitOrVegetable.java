package conditionalStatementsAdvancedLab;

import java.util.Scanner;

//•	Плодовете "fruit" са banana, apple, kiwi, cherry, lemon и grapes
//        •	Зеленчуците "vegetable" са tomato, cucumber, pepper и carrot
//        •	Всички останали са "unknown"

public class fruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();

        switch (fruit){
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "carrot":
            case "pepper":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
