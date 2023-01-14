package main.problemDescisionsMoreExercise;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String newStr = "";

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            newStr = ch + newStr;
        }
        System.out.println(newStr);
    }
}
