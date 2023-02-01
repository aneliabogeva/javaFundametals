package main.methodsLab;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printingTriangle(number);
    }

    public static void printingTriangle(int number){
        StringBuilder output = new StringBuilder();
        for(int i = 1; i <= number; i++) {
            output.append(i).append(" ");
            System.out.println(output);
        }
        output = new StringBuilder();
        for(int i = number-1; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                output.append(j).append(" ");
            }
            System.out.println(output);
            output = new StringBuilder();
        }

    }
}
