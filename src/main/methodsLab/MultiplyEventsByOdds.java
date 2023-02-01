package main.methodsLab;

import java.util.Scanner;

public class MultiplyEventsByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] stringInNumber = scanner.nextLine().toCharArray();
        int[] numberForCalculations = parsStringWithChecks(stringInNumber);
        System.out.println(getSum(numberForCalculations));
    }

    public static int[] parsStringWithChecks(char[] stringInNumber) {
        int[] secondArray;
        if (stringInNumber[0] == 45) {
            secondArray = new int[stringInNumber.length - 1];
            for (int i = 1; i < stringInNumber.length; i++) {
                secondArray[i - 1] += Integer.parseInt(String.valueOf(stringInNumber[i]));
            }
        } else {
            secondArray = new int[stringInNumber.length];
            for (int i = 0; i < stringInNumber.length; i++) {
                secondArray[i] += Integer.parseInt(String.valueOf(stringInNumber[i]));
            }
        }
        return secondArray;
    }

    public static int getSum(int[] number) {
        int sumOdd = 0;
        int sumEven = 0;
        int sum;
        for (int j : number) {
            if (j % 2 != 0) {
                sumOdd += j;
            } else {
                sumEven += j;
            }
        }
        sum = sumEven * sumOdd;
        return sum;
    }
}
