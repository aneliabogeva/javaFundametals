package main.assosiativeArraysLab;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> newHashMap = new LinkedHashMap<>();
        for (String word:input) {
            word = word.toLowerCase();

            newHashMap.putIfAbsent(word, 0);
            newHashMap.put(word, newHashMap.get(word) + 1);
        }
        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : newHashMap.entrySet()) {
            if(entry.getValue() %2 != 0){
                resultList.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", resultList));
    }
}
