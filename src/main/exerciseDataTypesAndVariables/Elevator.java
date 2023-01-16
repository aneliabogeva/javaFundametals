package main.exerciseDataTypesAndVariables;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPerson = Integer.parseInt(scanner.nextLine());
        int personPerCourse = Integer.parseInt(scanner.nextLine());
        int courses = 0;

        if(numberOfPerson <= personPerCourse){
            /*System.out.println("All the people fit inside the elevator.\n" +
                    "Only one course is needed.\n");*/
            System.out.println(1);
        }else {
            if(numberOfPerson % personPerCourse == 0){
                courses += numberOfPerson / personPerCourse;
                //System.out.printf("%d courser * %d people%n", courses, personPerCourse);
                System.out.println(courses);
            }else{
                courses = (int) Math.ceil((double) numberOfPerson / personPerCourse);
                System.out.println(courses);
                //System.out.printf("%d courses * %d people%n", courses, personPerCourse);
                //System.out.printf("+ 1 course * %d persons%n", numberOfPerson % personPerCourse);
            }
        }
    }
}
