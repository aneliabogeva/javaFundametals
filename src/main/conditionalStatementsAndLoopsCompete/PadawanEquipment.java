package main.conditionalStatementsAndLoopsCompete;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        double countOfStudents = Double.parseDouble(scanner.nextLine());
        double priceOfLightsabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelt = Double.parseDouble(scanner.nextLine());
        double sum;
        double counterForBelts;
        double totalCostForBelts;

        double numberOfSabers = Math.ceil((countOfStudents * 0.10)+countOfStudents);
        double totalCostForLights = numberOfSabers * priceOfLightsabers;

        double totalCostForRobes = priceOfRobes * countOfStudents;

        if(countOfStudents > 5){
            counterForBelts = Math.floor(countOfStudents / 6);
            totalCostForBelts = (countOfStudents - counterForBelts)*priceOfBelt;
        }else{
            totalCostForBelts = countOfStudents*priceOfBelt;
        }
        sum = totalCostForBelts + totalCostForLights + totalCostForRobes;

        double finalResult = Math.abs(sum-amountOfMoney);

        if(sum > amountOfMoney){
            System.out.printf("George Lucas will need %.2flv more.", finalResult);
        }else{
            System.out.printf("The money is enough - it would cost %.2flv.",sum);
        }
    }
}
