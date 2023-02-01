package main.methodsLab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        String outputString = repeatedString(inputString, number);
        System.out.println(outputString);
    }

    public static String repeatedString(String string, int number){
        return String.valueOf(string).repeat(Math.max(0, number));
    }
}
