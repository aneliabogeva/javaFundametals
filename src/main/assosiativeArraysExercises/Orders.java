package main.assosiativeArraysExercises;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputInformation = Arrays.stream(scanner.nextLine().split(" ")).toArray(String[]::new);

        LinkedHashMap<String, Double[]> newLinkedHasMap = new LinkedHashMap<>();
        while(!inputInformation[0].equals("buy")){
            String key = inputInformation[0];
            Double price = Double.parseDouble(inputInformation[1]);
            Double quantity = Double.parseDouble(inputInformation[2]);
            if(!newLinkedHasMap.containsKey(key)){
                newLinkedHasMap.put(key, new Double[]{price, quantity});
            }else{
                double newQuantity = newLinkedHasMap.get(key)[1] + quantity;
                newLinkedHasMap.put(key, new Double[]{price, newQuantity});
            }
            inputInformation = Arrays.stream(scanner.nextLine().split(" ")).toArray(String[]::new);
        }

        LinkedHashMap<String, Double> secondMap = new LinkedHashMap<>();
        for (Map.Entry<String, Double[]> entry : newLinkedHasMap.entrySet()) {
            double finalResult = entry.getValue()[0] * entry.getValue()[1];
            secondMap.put(entry.getKey(), finalResult);
        }

        for (Map.Entry<String, Double> entry : secondMap.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        }
    }
}
