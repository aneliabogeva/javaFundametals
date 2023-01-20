package main.arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int i = 0; i < numArray.length; i++){
            boolean isItBigger = true;
            for(int j = i + 1; j < numArray.length; j++){
                if(numArray[i] <= numArray[j]){
                    isItBigger = false;
                }
            }
            if(isItBigger)
                System.out.print(numArray[i] + " ");
        }
    }
}
