package main.assosiativeArraysLab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfIteration = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, ArrayList<String>> newHashMap = new LinkedHashMap<>();
        for(int i = 0; i < numberOfIteration; i++){
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            if(!newHashMap.containsKey(word)){
                newHashMap.put(word, new ArrayList<>());
            }
            newHashMap.get(word).add(synonym);
            System.out.println();
        }
        for(Map.Entry<String, ArrayList<String>> entry : newHashMap.entrySet()){
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }
    }
}
