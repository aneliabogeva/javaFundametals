package main.dataTypesAndVariablesLab;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int currentNumber;
        for (int i = 1; i <= number; i++) {
            currentNumber = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            if((sum == 5) || (sum == 7) || (sum == 11)){
                System.out.printf("%d -> True%n", currentNumber);
            }else{
                System.out.printf("%d -> False%n", currentNumber);
            }
            sum = 0;
            i = currentNumber;
        }
    }
}
