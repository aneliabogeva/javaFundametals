package main.assosiativeArraysExercises;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        LinkedHashMap<String, List<String>> userMap = new LinkedHashMap<>();
        List<String> userName = new ArrayList<>();

        while (!command.equals("Lumpawaroo")) {
            if (command.contains(" | ")) {
                String[] inputArr = command.split(" \\| ");
                String key = inputArr[0];
                String value = inputArr[1];

                if (!userMap.containsKey(key)) {
                    if (!userMap.containsValue(value)) {
                        userName.add(value);
                        userMap.put(key, userName);
                    } else {
                    }
                } else {
                    List<String> checkNames = userMap.get(key);
                    if (!checkNames.contains(value)) {
                        userName.add(value);
                        userMap.put(key, userName);
                    } else {

                    }
                }


            } else if (command.contains(" -> ")) {
                String[] inputArr = command.split(" -> ");
                String key = inputArr[1];
                String value = inputArr[0];

                if (!userMap.containsValue(value)) {
                    userMap.put(key, userName);
                } else {
                    userMap.put(key, userName);
                }

            }


            command = scanner.nextLine();
        }

    }
}
