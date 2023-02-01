package main.methodsExsercises;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        divisionOfFactorials(factorialCalculation(number1), factorialCalculation(number2));
    }

    public static double factorialCalculation(int number) {
        double factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void divisionOfFactorials(double n1, double n2){
        System.out.printf("%.2f", n1 / n2);
    }
}
