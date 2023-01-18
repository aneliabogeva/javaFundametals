package main.arraysLab;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] newArray = scanner.nextLine().split(" ");
        String[] outArray = new String[newArray.length];

        for(int i = 0; i < newArray.length; i++){
            outArray[(newArray.length-1)-i] = newArray[i];
        }
        for (String s : outArray) {
            System.out.print(s + " ");
        }
    }
}
