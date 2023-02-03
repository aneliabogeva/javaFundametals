package main.methodsMore;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String number = scanner.nextLine();
        switch (command){
            case "int":
                int newNumber = Integer.parseInt(number);
                checkMethod(newNumber);
                break;
            case "real":
                double newDouble = Double.parseDouble(number);
                checkMethod(newDouble);
                break;
            case "string":
                checkMethod(number);
                break;
            default:
                break;
        }
    }

    public static void checkMethod(int number){
        System.out.println(number * 2);
    }

    public static void checkMethod(double number){
        System.out.printf("%.2f",number * 1.5);
    }

    public static void checkMethod(String number){
        System.out.printf("$"+number+"$");
    }
}
