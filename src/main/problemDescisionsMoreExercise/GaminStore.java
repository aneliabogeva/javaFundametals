package main.problemDescisionsMoreExercise;

import java.util.Scanner;

public class GaminStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double totalSpend = 0;

        while (!command.equals("Game Time")){
            switch (command){
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    if(budget < 39.99){
                        System.out.println("Too Expensive");
                    }else{
                        budget -= 39.99;
                        System.out.printf("Bought %s\n", command);
                        totalSpend += 39.99;
                    }
                    break;
                case "CS: OG":
                    if(budget < 15.99){
                        System.out.println("Too Expensive");
                    }else{
                        budget -= 15.99;
                        System.out.printf("Bought %s\n", command);
                        totalSpend += 15.99;
                    }
                    break;
                case "Zplinter Zell":
                    if(budget < 19.99){
                        System.out.println("Too Expensive");
                    }else{
                        budget -= 19.99;
                        System.out.printf("Bought %s\n", command);
                        totalSpend += 19.99;
                    }
                    break;
                case "Honored 2":
                    if(budget < 59.99){
                        System.out.println("Too Expensive");
                    }else{
                        budget -= 59.99;
                        System.out.printf("Bought %s\n", command);
                        totalSpend += 59.99;
                    }
                    break;
                case "RoverWatch":
                    if(budget < 29.99){
                        System.out.println("Too Expensive");
                    }else{
                        budget -= 29.99;
                        System.out.printf("Bought %s\n", command);
                        totalSpend += 29.99;
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            if(budget <= 0){
                budget = 0;
                System.out.println("Out of money!");
                break;
            }else{
                command = scanner.nextLine();
            }
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f",totalSpend, budget);
    }
}
