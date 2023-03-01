package main.assosiativeArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class StreamAPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] newWords = Arrays.stream(scanner.nextLine().split(" ")).filter(x -> x.length() % 2 == 0).toArray(String[]::new);

        for (String words: newWords) {
            System.out.println(words);
        }
    }
}
