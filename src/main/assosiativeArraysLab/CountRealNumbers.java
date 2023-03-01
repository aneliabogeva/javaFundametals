package main.assosiativeArraysLab;

import java.text.DecimalFormat;
import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        TreeMap<Double, Integer> newMap = new TreeMap<>();
        for (double number: input) {
            if(!newMap.containsKey(number)){
                newMap.put(number, 1);
            }else{
                newMap.put(number, newMap.get(number)+1);
            }
        }
        for(Map.Entry<Double, Integer> entry : newMap.entrySet()){
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
