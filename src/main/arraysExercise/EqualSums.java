package main.arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean isFound = false;

        for (int i = 0; i < intArr.length; i++) {
            int rightSum = 0;
            int leftSum = 0;

            for (int j = 0; j < i; j++) {
                rightSum = rightSum + intArr[j];
            }
            for (int j = i + 1; j < intArr.length; j++) {
                leftSum = leftSum + intArr[j];
            }

            if (rightSum == leftSum) {
                System.out.println(i);
                isFound = true;
                return;
            }
        }
        System.out.println("no");
    }
}
