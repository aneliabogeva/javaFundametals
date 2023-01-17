package main.dataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int numberOfLetters = Integer.parseInt(scanner.nextLine());
        StringBuilder str = new StringBuilder();
        while (numberOfLetters > 0)
        {
            str.append((char) (scanner.nextLine().charAt(0) + key));
            numberOfLetters--;
        }
        System.out.println(str);
    }
}
