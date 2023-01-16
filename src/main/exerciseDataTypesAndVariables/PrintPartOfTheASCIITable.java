package main.exerciseDataTypesAndVariables;

import java.util.Scanner;

public class PrintPartOfTheASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        StringBuilder str = new StringBuilder();

        for(int i = n1; i <= n2; i++){
            str.append(Character.valueOf((char) i)).append(" ");
        }
        System.out.println(str);
    }
}
