package main.textPeocessingExercise;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputTex = scanner.nextLine().split(", ");

        for(int i = 0; i < inputTex.length; i++){
            if(checkWord(inputTex[i])){
                System.out.println(inputTex[i]);
            }
        }

    }

    public static boolean checkWord(String word){
        boolean valid = true;
        if(word.length() > 3 && word.length() < 16){
            for(int j = 0; j < word.length(); j++){
                char symbol = word.charAt(j);
                if(!Character.isLetter(symbol) && !Character.isDigit(symbol) && symbol != 95 && symbol != 45){
                    valid = false;
                }
            }
        }else{
            valid = false;
        }
        return valid;
    }
}
