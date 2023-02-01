package main.methodsLab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String value1 = scanner.nextLine();
        String value2 = scanner.nextLine();
        switch (string){
            case "int":
                System.out.println(getMax(Integer.parseInt(value1), Integer.parseInt(value2)));
                break;
            case "char":
                char first = value1.charAt(0);
                char second = value2.charAt(0);
                System.out.println(getMax(first, second));
                break;
            case "string":
                System.out.println(getMax(value1, value2));
                break;
        }
    }

    public static int getMax(int firstNumber, int secondNumber){
        return Math.max(firstNumber, secondNumber);
    }
    public static String getMax(String first, String second){
        if(first.compareTo(second) >= 0){
            return first;
        }
        return second;
    }

    public static char getMax(char char1, char char2){
        if(char1 > char2){
            return char1;
        }
        return char2;
    }
}
