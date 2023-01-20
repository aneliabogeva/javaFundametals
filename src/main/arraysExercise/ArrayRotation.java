package main.arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int numRotations = Integer.parseInt(scanner.nextLine());
         for(int i = 1; i <= numRotations; i++){
             int firstElement = numArray[0];
             for(int index = 0; index < numArray.length-1; index++){
                 numArray[index] = numArray[index+1];
             }
             numArray[numArray.length-1] = firstElement;
         }
        for (int number:numArray) {
            System.out.print(number + " ");
        }
    }
}
