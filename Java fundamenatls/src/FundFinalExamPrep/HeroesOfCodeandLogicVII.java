package FundFinalExamPrep;

import java.util.ArrayList;
import java.util.List;
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

        public String getName() {
            return name;
        }

        public int getHitPoints() {
            return hitPoints;
        }

        public int getManaPoints() {
            return manaPoints;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Hero> heroes = new ArrayList<>();
        int countHeroes = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < countHeroes; i++) {
            String line = scanner.nextLine();
            String[] heroParams = line.split(" ");
            Hero hero = new Hero(heroParams[0], Integer.parseInt(heroParams[1]), Integer.parseInt(heroParams[2]));
            heroes.add(hero);
        }
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] commandsPart = command.split(" – ");
            String commandName = commandsPart[0];
            switch (commandName) {
                case "CastSpell":
                    handleCastSpell(commandsPart[0], Integer.parseInt(commandsPart[1]), Integer.parseInt(commandsPart[2]))
                    break;
                case "TakeDamage":
                    break;
                case "Recharge":
                    break;
                case "Heal":
                    break;
//                default:
//                    throw new IllegalStateException("Unknown command " + commandName);
            }
            command = scanner.nextLine();
        }
        for (Hero hero : heroes) {
            System.out.println(hero.getName() + System.lineSeparator()
                    + "  HP: " + hero.getHitPoints() + System.lineSeparator()
                    + "  MP: " + hero.getManaPoints());
        }
    }

    private static void handleCastSpell(String s, int i, int i1) {
    }
}
