package main.arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int biggestCounter = 0;
        int keepFirstIndex = 0;
        int keepSecondIndex = 0;

        int i = 0;

        while (i < intArray.length - 1) {
            int j = i + 1;
            int counter = 1;
            while (j < intArray.length && intArray[j] == intArray[i]) {
                counter++;
                j++;
            }
            if (counter > biggestCounter) {
                biggestCounter = counter;
                keepFirstIndex = i;
                keepSecondIndex = j;
            }
            i = j;
        }
        for (i = keepFirstIndex; i < keepSecondIndex; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}
