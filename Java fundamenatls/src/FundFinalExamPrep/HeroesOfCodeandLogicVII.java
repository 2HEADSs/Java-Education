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

        public boolean castSpell(int manaPoints) {
            if (getManaPoints() >= manaPoints) {
                this.manaPoints -= manaPoints;
                return true;
            }
            return false;
        }

        public void setHitPoints(int hitPoints) {
            this.hitPoints = hitPoints;
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
        boolean success = hero.castSpell(manaPoints);
        if (success) {
            System.out.println(heroName + " has successfully cast" + spellName + "and now has " + manaPoints + " MP!");
        } else {
            System.out.println(hero.getName() + " does not have enough MP to cast " + spellName + "!");
        }
    }

    private static void handleTakeDamage(Map<String, Hero> heroes, String heroName, int demage, int attacker) {
        Hero hero = heroes.get(heroName);
        hero.setHitPoints(hero.getHitPoints() - demage);
        if (hero.getHitPoints() > 0) {
            System.out.println(hero.getName() + " was hit for " + demage + " HP by " + attacker + " and now has " + hero.getHitPoints() + " HP left!");
        } else {
            System.out.println(hero.getName() + " has been killed by " + attacker + "!");
            heroes.remove(heroName);
        }
    }

    private static void handleReacharge(Map<String, Hero> heroes, String heroName, int amount) {
        Hero hero = heroes.get(heroName);
        
    }

    private static void handleHeal(Map<String, Hero> heroes, String heroName, int amount) {
    }


}
