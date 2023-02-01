package main.methodsLab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine();
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        calculations(number1, number2, action);
    }

    public static void calculations(int num1, int num2, String act){
        switch (act) {
            case "add" -> System.out.println(num1 + num2);
            case "multiply" -> System.out.println(num1 * num2);
            case "subtract" -> System.out.println(num1 - num2);
            case "divide" -> {
                if (num2 != 0) {
                    System.out.println(num1 / num2);
                }
            }
        }
    }
}
