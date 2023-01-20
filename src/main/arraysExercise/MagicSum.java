package main.arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int number = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < intArray.length; i++){
            int checkingNumber = intArray[i];
            for (int j = i+1; j < intArray.length; j++){
                int newNumber = intArray[j];
                int sum = checkingNumber + newNumber;
                if(sum == number){
                    System.out.println(checkingNumber + " " + newNumber);
                }
            }
        }
    }
}
