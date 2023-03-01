package main.assosiativeArraysExercises;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        boolean ifExist = false;
        LinkedHashMap<String, String> mapOdUsers = new LinkedHashMap<>();

        for (int i = 0; i < number; i++) {
            String[] commandAndUser = Arrays.stream(scanner.nextLine().split(" ")).toArray(String[]::new);

            if (commandAndUser[0].equals("register")) {
                String key = commandAndUser[1];
                String license = commandAndUser[2];
                if (!mapOdUsers.containsKey(key)) {
                    mapOdUsers.put(key, license);
                    System.out.printf("%s registered %s successfully%n", key, license);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", mapOdUsers.get(key));
                }
            } else if (commandAndUser[0].equals("unregister")){
                if(!mapOdUsers.containsKey(commandAndUser[1])){
                    System.out.printf("ERROR: user %s not found%n", commandAndUser[1]);
                }else{
                    System.out.printf("%s unregistered successfully%n", commandAndUser[1]);
                    mapOdUsers.remove(commandAndUser[1]);
                }
            }else{}
        }

        for (Map.Entry<String, String> entry : mapOdUsers.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }

    }
}
