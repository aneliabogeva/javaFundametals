package main.methodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        double result = mathPower(number, power);
        System.out.println(new DecimalFormat("0.####").format(result));
    }

    public static double mathPower(double num, int pow){
        return Math.pow(num, pow);
    }
}
