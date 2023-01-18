package main.arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] newArray = new int[inputArray.length-1];

        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray.length == 1){
                break;
            }
            if(i == inputArray.length-1){
               int[] secondNew = new int[newArray.length-1];
               i = -1;
               inputArray = newArray;
               newArray = secondNew;
            }else{
                newArray[i] = inputArray[i] + inputArray[i+1];
            }
        }
        System.out.println(inputArray[0]);
    }
}
