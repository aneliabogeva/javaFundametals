package main.methodsExsercises;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        while(!number.equals("END")){
            palindromeNumber(number);
            number = scanner.nextLine();
        }
    }

    public static void palindromeNumber(String number){
        StringBuilder newString = new StringBuilder();
        String[] test = number.split("");
        for(int i = test.length; i > 0; i--){
            newString.append(test[i - 1]);
        }
        System.out.println(number.equals(newString.toString()));
    }

}
