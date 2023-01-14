package main.conditionalStatementsAndLoopsCompete;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        int counterHeadSet = 0;
        int counterMouse = 0;
        int counterKeyboard = 0;
        int counterDisplay = 0;

        for(int i = 1; i <= lostGamesCount; i++){
            if(i%2 == 0){
                counterHeadSet += 1;
            }
            if (i%3 == 0) {
                counterMouse += 1;
            }
            if((i%2==0) && (i%3==0)){
                counterKeyboard +=1;
                if (counterKeyboard % 2==0) {
                    counterDisplay+=1;
                }
            }
        }
        double totalSum = counterHeadSet * headsetPrice + counterMouse * mousePrice + counterKeyboard * keyboardPrice + counterDisplay * displayPrice;
        System.out.printf("Rage expenses: %.2f lv.", totalSum);
    }
}
