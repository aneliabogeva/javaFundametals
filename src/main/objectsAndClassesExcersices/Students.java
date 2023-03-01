package main.objectsAndClassesExcersices;

import java.util.*;

public class Students {
    String firstName;

    @Override
    public String toString() {
        String message = String.format("%s %s: %.2f", firstName, lastName, grade);
        return super.toString();
    }

    String lastName;
    double grade;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Students(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        ArrayList<Students> outputStudents = new ArrayList<>();

        for(int i = 0; i < number; i++) {
            String inputStudent = scanner.nextLine();
            String[] inputStudentsParam = inputStudent.split(" ");
            Students students = new Students(inputStudentsParam[0], inputStudentsParam[1], Double.parseDouble(inputStudentsParam[2]));

            outputStudents.add(students);
        }
        outputStudents.sort(Comparator.comparing(Students::getGrade).reversed());
        for (Students names:outputStudents) {
            System.out.printf("%s %s: %.2f%n", names.getFirstName(), names.getLastName(), names.getGrade());
        }
    }
}
