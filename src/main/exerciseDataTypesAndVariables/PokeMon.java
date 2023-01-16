package main.exerciseDataTypesAndVariables;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int initialPower = power;
        int counter = 0;

        while(power >= distance){
            power -= distance;
            counter += 1;

            if(power == initialPower / 2){
                if(exhaustionFactor != 0){
                    power /= exhaustionFactor;
                }
            }
        }
        System.out.println(power);
        System.out.println(counter);
    }
}
