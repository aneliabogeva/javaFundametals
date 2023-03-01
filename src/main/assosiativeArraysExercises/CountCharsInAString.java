package main.assosiativeArraysExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().replaceAll(" ", "");

        LinkedHashMap<Character, Integer> newHasMap = new LinkedHashMap<>();
        for (char element: input.toCharArray()) {
            newHasMap.putIfAbsent(element, 0);
            newHasMap.put(element, newHasMap.get(element) + 1);
        }
        for (Map.Entry<Character, Integer> entry : newHasMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
