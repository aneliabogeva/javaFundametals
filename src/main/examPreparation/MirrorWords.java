package main.examPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        String regex = "(#|@)(?<first>[A-Za-z]{3,})(\\1)(\\1)(?<second>[A-Za-z]{3,})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputText);
        int counterAll = 0;
        int counterValid = 0;
        List<String> validPairs = new ArrayList<>();

        while(matcher.find()){


            String firstWord = matcher.group("first");
            String second = matcher.group("second");
            counterAll += 1;
            String secondRev = new StringBuilder(second).reverse().toString();
            if(firstWord.equals(secondRev)){
                validPairs.add(firstWord + " <=> " + second);
                counterValid += 1;
            }
        }

        if(counterAll == 0){
            System.out.println("No word pairs found!");
        } else{
            System.out.printf("%d word pairs found!%n", counterAll);
        }

        if (counterValid == 0) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", validPairs));
        }
    }
}
