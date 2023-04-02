package main.textPeocessingExercise;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger firstNumber = new BigInteger(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        BigInteger result = new BigInteger(firstNumber.multiply(BigInteger.valueOf(secondNumber)).toString());

        System.out.println(result);
    }
}
