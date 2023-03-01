package main.assosiativeArraysExercises;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        LinkedHashMap<String, List<String>> companyMap = new LinkedHashMap<>();

        while(!command.equals("End")){
            String[] inputArray = command.split(" -> ");
            String key = inputArray[0];
            String value = inputArray[1];
            List<String> nameList = new ArrayList<>();

            if(!companyMap.containsKey(key)){
                nameList.add(value);
                companyMap.put(key, nameList);
            }else{
                nameList = companyMap.get(key);
                if(!nameList.contains(value)){
                    nameList.add(value);
                }else{
                    companyMap.put(key, nameList);
                }
            }
            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : companyMap.entrySet()) {
            System.out.printf("%s%n", entry.getKey());

            System.out.printf("-- %s%n", String.join("\n-- ",entry.getValue()));
        }
    }
}
