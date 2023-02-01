package main.methodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int result = getOperation(firstNumber, operator, secondNumber);
        System.out.println(new DecimalFormat("0.####").format(result));
    }

    public static int getOperation(int n1, String operation, int n2){
        int result = 0;
        switch (operation) {
            case "+" -> result = n1 + n2;
            case "-" -> result = n1 - n2;
            case "*" -> result = n1 * n2;
            case "/" -> result = n1 / n2;
            default -> {
            }
        }
        return result;
    }
}
