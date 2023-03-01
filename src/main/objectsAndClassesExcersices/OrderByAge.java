package main.objectsAndClassesExcersices;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class OrderByAge {
    String name;
    String id;
    int age;

    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.", name, id, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public OrderByAge(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        ArrayList<OrderByAge> outPut = new ArrayList<>();

        while(!input[0].equals("End")){
            OrderByAge orderByAge = new OrderByAge(input[0], input[1], Integer.parseInt(input[2]));
            outPut.add(orderByAge);
            input = scanner.nextLine().split("\\s+");
        }

        outPut.sort(Comparator.comparing(OrderByAge::getAge));
        for (OrderByAge name: outPut) {
            String message = String.format("%s with ID: %s is %d years old.", name.getName(), name.getId(), name.getAge());
            System.out.println(message);
        }
    }
}
