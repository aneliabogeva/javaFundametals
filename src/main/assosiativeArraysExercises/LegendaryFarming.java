package main.assosiativeArraysExercises;

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> mapOfMaterials = new LinkedHashMap<>();
        mapOfMaterials.put("shards", 0);
        mapOfMaterials.put("fragments", 0);
        mapOfMaterials.put("motes", 0);
        LinkedHashMap<String, Integer> junkMaterials = new LinkedHashMap<>();

        boolean isValid = false;

        while (!isValid) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int i = 0; i < input.length; i += 2) {
                String key = input[i + 1].toLowerCase();
                int value = Integer.parseInt(input[i]);
                if(key.equals("shards") || key.equals("fragments") || key.equals("motes")){
                    if (!mapOfMaterials.containsKey(key)) {
                        mapOfMaterials.put(key, value);
                    } else {
                        int quantity = mapOfMaterials.get(key);
                        mapOfMaterials.put(key, quantity + value);
                        if (mapOfMaterials.get(key) >= 250) {
                            if (key.equals("fragments")) {
                                System.out.println("Valanyr obtained!");
                            } else if (key.equals("shards")) {
                                System.out.println("Shadowmourne obtained!");
                            } else {
                                System.out.println("Dragonwrath obtained!");
                            }
                            int newValue = mapOfMaterials.get(key) - 250;
                            mapOfMaterials.put(key, newValue);
                            isValid = true;
                            break;
                        }
                    }
                }else{
                    if (!junkMaterials.containsKey(key)) {
                        junkMaterials.put(key, value);
                    }else{
                        int quantity = junkMaterials.get(key);
                        junkMaterials.put(key, quantity + value);
                    }
                }
            }
        }

        for (Map.Entry<String, Integer> integerEntry : mapOfMaterials.entrySet()) {
            System.out.printf("%s: %d%n", integerEntry.getKey(), integerEntry.getValue());
        }

        for (Map.Entry<String, Integer> integerEntry : junkMaterials.entrySet()) {
            System.out.printf("%s: %d%n", integerEntry.getKey(), integerEntry.getValue());
        }
    }
}
