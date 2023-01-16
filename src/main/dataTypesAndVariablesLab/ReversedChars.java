package main.dataTypesAndVariablesLab;

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder str = new StringBuilder();

        for(int i = 1; i <= 3; i++){
            String ch = scanner.nextLine();
            str.insert(0, ch + " ");
        }
        System.out.println(str);
    }
}
