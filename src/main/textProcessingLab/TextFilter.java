package main.textProcessingLab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bandedWord = scanner.nextLine().split(", ");
        String textInput = scanner.nextLine();

        for (String word : bandedWord) {
            String asterisk = repeatString(word.length());
            textInput = textInput.replace(word, asterisk);
        }
        System.out.println(textInput);
    }

    public static String repeatString(int count){
        String result = "";
        for(int i = 0; i < count; i++){
            result += "*";
        }
        return result;
    }
}
