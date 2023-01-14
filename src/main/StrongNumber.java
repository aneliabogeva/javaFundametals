package main;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int factorial = 1;
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            int newFactorial = Integer.parseInt(String.valueOf(ch));
            for (int j = 1; j <= newFactorial; j++) {
                factorial *= j;
            }

            if (newFactorial == 0) {
                sum += 1;
            } else {
                sum += factorial;
                factorial = 1;
            }
        }
        if (Integer.parseInt(number) == sum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
