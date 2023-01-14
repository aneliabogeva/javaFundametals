package main;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String message = null;

        if(number % 2 == 0){
            message = "The number is divisible by 2";
        }
        if (number % 3 == 0) {
            message = "The number is divisible by 3";
        }
        if (number % 6 == 0) {
            message = "The number is divisible by 6";
        }
        if (number % 7 == 0) {
            message = "The number is divisible by 7";
        }
        if (number % 10 == 0) {
            message = "The number is divisible by 10";
        }
        if(message == null){
            message = "Not divisible";
        }
        System.out.println(message);
    }
}
