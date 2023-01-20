package main.arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for(int i = 0; i < n; i++){
            int[] inputArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if(i%2==0){
                firstArray[i] += inputArray[0];
                secondArray[i] += inputArray[1];
            }else{
                firstArray[i] += inputArray[1];
                secondArray[i] += inputArray[0];
            }

        }
        for (int j : firstArray) System.out.print(j + " ");
        System.out.println();
        for (int j : secondArray) System.out.print(j + " ");
    }
}
