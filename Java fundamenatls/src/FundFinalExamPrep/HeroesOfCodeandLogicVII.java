package FundFinalExamPrep;

import java.util.Scanner;

public class HeroesOfCodeandLogicVII {
    static class Hero {
        String name;
        int hitPoints;
        int manaPoints;

        public Hero(String name, int hitPoints, int manaPoints) {
            this.name = name;
            this.hitPoints = hitPoints;
            this.manaPoints = manaPoints;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countHeroes = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < countHeroes; i++) {
            String line = scanner.nextLine();
            String[] heroParams = line.split(" ");
            new Hero(heroParams[0], Integer.parseInt(heroParams[1]), Integer.parseInt(heroParams[2]));
        }
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] commandsPart = command.split(" – ");

            command = scanner.nextLine();
        }
        System.out.println(command);
    }
}
