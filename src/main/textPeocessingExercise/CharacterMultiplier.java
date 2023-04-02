package main.textPeocessingExercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        System.out.println(StringMultiplication(input[0], input[1]));
    }

    public static int StringMultiplication(String first, String second){
        int result = 0;

        if(first.length() == second.length()){
            for(int i = 0; i < first.length(); i++){
                char symbolFirst = first.charAt(i);
                char symbolSecond = second.charAt(i);
                int multiplication = symbolFirst * symbolSecond;
                result += multiplication;
            }
        }else if(first.length() > second.length()){
            for(int i = 0; i < second.length(); i++){
                char symbolFirst = first.charAt(i);
                char symbolSecond = second.charAt(i);
                int multiplication = symbolFirst * symbolSecond;
                result += multiplication;
            }
            String subString = first.substring(second.length());
            for (int i = 0; i < subString.length(); i++){
                char otherSymbol = subString.charAt(i);
                result += otherSymbol;
            }
        } else if (first.length() < second.length()) {
            for(int j = 0; j < first.length(); j++){
                char symbolFirst = first.charAt(j);
                char symbolSecond = second.charAt(j);
                int multiplication = symbolFirst * symbolSecond;
                result += multiplication;
            }
            String subString = second.substring(first.length());
            for (int i = 0; i < subString.length(); i++){
                char otherSymbol = subString.charAt(i);
                result += otherSymbol;
            }
        }
        return result;
    }
}

