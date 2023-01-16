package main.exerciseDataTypesAndVariables;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());
        int counterOfDays = 0;
        int remainedSpice;
        int totalRemaind = 0;

        if (startingYield < 100) {
            System.out.printf("%d%n", counterOfDays);
            System.out.printf("%d%n", totalRemaind);
        } else {
            while (startingYield >= 100) {
                remainedSpice = startingYield - 26;
                totalRemaind += remainedSpice;
                counterOfDays += 1;

                startingYield -= 10;
            }
            if (totalRemaind >= 26) totalRemaind -= 26;
            System.out.printf("%d%n", counterOfDays);
            System.out.printf("%d%n", totalRemaind);
        }
    }
}
