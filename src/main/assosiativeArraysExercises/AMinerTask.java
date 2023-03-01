package main.assosiativeArraysExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        LinkedHashMap<String, Integer> newLinkedHashMap = new LinkedHashMap<>();
        while(!command.equals("stop")){
            int number = Integer.parseInt(scanner.nextLine());
            if(newLinkedHashMap.containsKey(command)){
                newLinkedHashMap.put(command, newLinkedHashMap.get(command) + number);
            }else{
                newLinkedHashMap.put(command, number);
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : newLinkedHashMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
