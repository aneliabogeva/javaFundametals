package main.assosiativeArraysExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        double average;
        int counter;

        LinkedHashMap<String, Double> studentsMap = new LinkedHashMap<>();
        for (int i = 0; i < numberOfStudents; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsMap.containsKey(name)) {
                studentsMap.put(name, grade);
            } else {
                double newGrade = studentsMap.get(name);
                counter = 2;
                average = (newGrade + grade) / counter;
                studentsMap.put(name, average);
            }
        }

        for (Map.Entry<String, Double> entry : studentsMap.entrySet()) {
            if (entry.getValue() >= 4.50) {
                System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
            }
        }
    }
}
