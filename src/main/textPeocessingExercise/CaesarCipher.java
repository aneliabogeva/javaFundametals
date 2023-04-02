package main.textPeocessingExercise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        StringBuilder outputText = new StringBuilder();

        for(int i = 0; i < inputText.length(); i++){
            char currentSymbol = inputText.charAt(i);
            char newSymbol = (char) (currentSymbol + 3);
            outputText.append(newSymbol);
        }
        System.out.println(outputText);
    }
}
