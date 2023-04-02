package main.textPeocessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < inputText.length()-1; i++) {

            char currentSymbol = inputText.charAt(i);
            char nextSymbol = inputText.charAt(i+1);

            if(currentSymbol != nextSymbol){
                sb.append(currentSymbol);
            }
        }
        sb.append(inputText.charAt(inputText.length()-1));
        System.out.println(sb);
    }
}
