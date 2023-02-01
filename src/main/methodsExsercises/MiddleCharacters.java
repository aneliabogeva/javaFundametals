package main.methodsExsercises;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        middleCharacters(input);
    }

    public static void middleCharacters(String input){
        int lengthString = input.length();
        if(lengthString == 1 || lengthString == 2){
            System.out.println(input);
        }else{
            if(lengthString%2==0){
                System.out.print(input.charAt(lengthString/2-1));
                System.out.println(input.charAt(lengthString/2));
            }else{
                System.out.println(input.charAt(lengthString/2));
            }
        }
    }
}
