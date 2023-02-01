package main.methodsExsercises;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] inputString = scanner.nextLine().toCharArray();
        System.out.println(getNumberOfVowels(inputString));
    }

    public static int getNumberOfVowels(char[] input) {
        int counter = 0;
        for (char c : input) {
            if (c == 65 || c == 97 || c == 69 || c == 101 ||
                    c == 73 || c == 105 || c == 79 || c == 111 ||
                    c == 85 || c == 117) {
                counter += 1;
            }
        }
        return counter;
    }
}
