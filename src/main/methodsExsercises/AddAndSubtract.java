package main.methodsExsercises;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        System.out.println(subtract(number1, number2, number3));
    }

    public static int sum(int n1, int n2){
        return n1 + n2;
    }
    public static int subtract(int n1, int n2, int n3){
        n1 = sum(n1, n2);
        return n1 - n3;
    }
}
