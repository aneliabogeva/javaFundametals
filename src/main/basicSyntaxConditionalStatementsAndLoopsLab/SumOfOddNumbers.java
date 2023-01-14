package main.basicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counterPrinted = 0;
        int number = 0;

        while (counterPrinted < n) {
           number++;
           if(number % 2 != 0){
               sum += number;
               counterPrinted++;
               System.out.println(number);
           }
        }
        System.out.printf("Sum: %d", sum);
    }
}
