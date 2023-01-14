package main.conditionalStatementsAndLoopsCompete;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfOrders = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;
        double sumPerCoffee;

        for(int i = 1; i <= numberOfOrders; i++){
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            sumPerCoffee = (days * capsulesCount) * pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f\n",sumPerCoffee);
            totalSum+=sumPerCoffee;
        }
        System.out.printf("Total: $%.2f",totalSum);
    }
}
