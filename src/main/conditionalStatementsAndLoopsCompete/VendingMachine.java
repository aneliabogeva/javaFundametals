package main.conditionalStatementsAndLoopsCompete;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double sum = 0;

        while(!command.equals("Start")){
            double cns = Double.parseDouble(command);
            if((cns != 0.1) && (cns!= 0.2) && (cns!= 0.5) && (cns!= 1.0) && (cns!= 2.0)){
                System.out.printf("Cannot accept %.2f\n", cns);
            }else{
                sum += cns;
            }
            command = scanner.nextLine();
        }

        command = scanner.nextLine();
        while(!command.equals("End")){
            switch(command){
                case "Nuts":
                    if(sum < 2.0){
                        System.out.println("Sorry, not enough money");
                    }else{
                        System.out.printf("Purchased %s\n",command);
                        sum -= 2.0;
                    }
                    break;
                case "Water":
                    if(sum < 0.7){
                        System.out.println("Sorry, not enough money");
                    }else{
                        System.out.printf("Purchased %s\n",command);
                        sum -= 0.7;
                    }
                    break;
                case "Crisps":
                    if(sum < 1.5){
                        System.out.println("Sorry, not enough money");
                    }else{
                        System.out.printf("Purchased %s\n",command);
                        sum -= 1.5;
                    }
                    break;
                case "Soda":
                    if(sum < 0.8){
                        System.out.println("Sorry, not enough money");
                    }else{
                        System.out.printf("Purchased %s\n",command);
                        sum -= 0.8;
                    }
                    break;
                case "Coke":
                    if(sum < 1.0){
                        System.out.println("Sorry, not enough money");
                    }else{
                        System.out.printf("Purchased %s\n",command);
                        sum -= 1.0;
                    }
                    break;
                default:
                    System.out.println("Invalid product");
            }
            command = scanner.nextLine();
        }
        if(sum >= 0){
            System.out.printf("Change: %.2f", sum);
        }
    }
}
