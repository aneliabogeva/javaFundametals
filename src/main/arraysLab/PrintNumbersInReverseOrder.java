package main.arraysLab;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int[] numArr = new int[number];
        int[] outPutArr = new int[number];

        for (int i = 0; i < number; i++) {
            numArr[i] = scanner.nextInt();
            outPutArr[(number-1)-i] = numArr[i];
        }
        for (int i: outPutArr) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
