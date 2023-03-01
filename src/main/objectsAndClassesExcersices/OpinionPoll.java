package main.objectsAndClassesExcersices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {
    public static class Person {
        String name;

        @Override
        public String toString() {
            String message = String.format("%s - %d", name, age);
            return message;
        }

        int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        List<String> outputList = new ArrayList<>();

        for (int i = 0; i < number; i++){
            String input = scanner.nextLine();
            String[] inputArr = input.split(" ");

            Person person = new Person(inputArr[0], Integer.parseInt(inputArr[1]));
            if(person.getAge() > 30){
                outputList.add(person.toString());
            }
        }
        for (String name: outputList) {
            System.out.println(name);
        }
    }
}
