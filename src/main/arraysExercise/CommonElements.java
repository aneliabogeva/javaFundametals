package main.arraysExercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");
        String newString = "";

        for(int i = 0; i < secondArray.length; i++){
            for(int j = 0; j < firstArray.length; j++){
                if(firstArray[j].equals(secondArray[i])){
                    newString = newString + secondArray[i] + " ";
                }
            }
        }
        System.out.println(newString);
    }
}
