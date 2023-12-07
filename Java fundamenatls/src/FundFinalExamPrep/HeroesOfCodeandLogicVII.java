package FundFinalExamPrep;

import java.util.*;

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

        Map<String, Hero> heroes = new LinkedHashMap<>();
        int countHeroes = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < countHeroes; i++) {
            String line = scanner.nextLine();
            String[] heroParams = line.split(" ");
            Hero hero = new Hero(heroParams[0], Integer.parseInt(heroParams[1]), Integer.parseInt(heroParams[2]));
            heroes.put(hero.getName(), hero);
        }
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] commandsPart = command.split(" – ");
            String commandName = commandsPart[0];
            switch (commandName) {
                case "CastSpell":
                    handleCastSpell(heroes, commandsPart[1], Integer.parseInt(commandsPart[2]), Integer.parseInt(commandsPart[3]));
                    break;
                case "TakeDamage":
                    handleTakeDamage(heroes, commandsPart[1], Integer.parseInt(commandsPart[2]), Integer.parseInt(commandsPart[3]));
                    break;
                case "Recharge":
                    handleReacharge(heroes, commandsPart[1], Integer.parseInt(commandsPart[2]));
                    break;
                case "Heal":
                    handleHeal(heroes, commandsPart[1], Integer.parseInt(commandsPart[1]));
                    break;
//                default:
//                    throw new IllegalStateException("Unknown command " + commandName);
            }
            command = scanner.nextLine();
        }
        for (Hero hero : heroes.values()) {
            System.out.println(hero.getName() + System.lineSeparator()
                    + "  HP: " + hero.getHitPoints() + System.lineSeparator()
                    + "  MP: " + hero.getManaPoints());
        }
    }

    private static void handleCastSpell(Map<String, Hero> heroes, String heroName, int manaPoints, int spellName) {
        Hero hero = heroes.get(heroName);
    }

    private static void handleTakeDamage(Map<String, Hero> heroes, String heroName, int demage, int attacker) {
    }

    private static void handleReacharge(Map<String, Hero> heroes, String heroName, int amount) {
    }

    private static void handleHeal(Map<String, Hero> heroes, String heroName, int amount) {
    }


}
