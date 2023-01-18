package main.arraysLab;

import java.util.Scanner;

public class DayOFWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dayOfWeeks = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        int number = Integer.parseInt(scanner.nextLine());
        if (number > 0 && number <= dayOfWeeks.length) {
            System.out.println(dayOfWeeks[number-1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
