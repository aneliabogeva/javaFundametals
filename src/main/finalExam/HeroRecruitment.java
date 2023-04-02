package main.finalExam;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroRecruitment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashMap<String, ArrayList<String>> heroesWithSpells = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String[] parts = input.split(" ");
            String command = parts[0];
            String heroName = parts[1];

            switch (command) {
                case "Enroll":

                    if (heroesWithSpells.containsKey(heroName)) {
                        System.out.printf("%s is already enrolled.%n", heroName);
                    }
                    heroesWithSpells.putIfAbsent(heroName, new ArrayList<>());
                    break;
                case "Learn":
                    String spellName = parts[2];

                    if (!heroesWithSpells.containsKey(heroName)) {
                        System.out.printf("%s doesn't exist.%n", heroName);
                    } else if (heroesWithSpells.containsKey(heroName)
                            && heroesWithSpells.get(heroName).contains(spellName)) {
                        System.out.printf("%s has already learnt %s.%n", heroName, spellName);
                    } else {
                        heroesWithSpells.get(heroName).add(spellName);
                    }
                    break;
                case "Unlearn":
                    String spellToRemove = parts[2];

                    if (!heroesWithSpells.containsKey(heroName)) {
                        System.out.printf("%s doesn't exist.%n", heroName);
                    } else if (heroesWithSpells.containsKey(heroName)
                            && !heroesWithSpells.get(heroName).contains(spellToRemove)) {
                        System.out.printf("%s doesn't know %s.%n", heroName, spellToRemove);
                    } else {
                        heroesWithSpells.get(heroName).remove(spellToRemove);
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println("Heroes: ");

        for (Map.Entry<String, ArrayList<String>> eachHero : heroesWithSpells.entrySet()) {
            System.out.println("== " + eachHero.getKey() + ": " + String.join(", ", eachHero.getValue()));
        }
    }
}
