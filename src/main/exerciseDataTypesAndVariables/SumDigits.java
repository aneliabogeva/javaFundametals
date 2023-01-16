package main.exerciseDataTypesAndVariables;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int sum = 0;

        for(int i = 0; i < number.length(); i++){
            int digit = Integer.parseInt(String.valueOf(number.charAt(i)));
            sum += digit;
        }
        System.out.println(sum);
    }
}
