package main.methodsExsercises;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        System.out.println(getMaxOfThree(number1, number2, number3));
    }

    public static int getMaxOfThree(int n1, int n2, int n3){
        int minInt = Integer.MAX_VALUE;
        if(n1 < minInt){
            minInt = n1;
        }
        if(n2 < n1) {
            minInt = n2;
        }
        if(n3 < n2){
            minInt = n3;
        }
        return minInt;
    }
}
