package main.basicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class BackIn30Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int calculatedMinutes = minutes + 30;
        if (calculatedMinutes >= 60){
            hours += 1;
            calculatedMinutes -= 60;
            if(hours > 23){
                hours -=24;
            }
            if(calculatedMinutes < 10){
                System.out.printf("%d:0%d", hours, calculatedMinutes);
            }else{
                System.out.printf("%d:%d", hours, calculatedMinutes);
            }
        }else{
            if(calculatedMinutes < 10){
                System.out.printf("%d:0%d", hours, calculatedMinutes);
            }else{
                System.out.printf("%d:%d", hours, calculatedMinutes);
            }
        }
    }
}