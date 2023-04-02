package main.textProcessingLab;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");
        String output = "";

        for(int i = 0; i < inputArr.length; i++){
            String currentWord = inputArr[i];
            int repeat = currentWord.length();
            for(int j = 0; j < repeat; j++){
                output += currentWord;
            }
        }
        System.out.println(output);
    }
}
