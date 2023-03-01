package main.assosiativeArraysExercises;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = Arrays.stream(scanner.nextLine().split(" : ")).toArray(String[]::new);

        LinkedHashMap<String, List<String>> mapOfCourse = new LinkedHashMap<>();
        while(!command[0].equals("end")){
            if(!mapOfCourse.containsKey(command[0])){
                List<String> newList = Collections.singletonList(command[1]);
                mapOfCourse.put(command[0], newList);
            }else{
                List<String> newListEx = new ArrayList<>(mapOfCourse.get(command[0]));
                newListEx.add(command[1]);
                mapOfCourse.put(command[0], newListEx);
            }
            command = Arrays.stream(scanner.nextLine().split(" : ")).toArray(String[]::new);
        }

        for (Map.Entry<String, List<String>> entry : mapOfCourse.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
            System.out.printf("-- %s%n", String.join("\n-- ", entry.getValue()));
        }
    }
}
