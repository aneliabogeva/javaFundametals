package main.arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int[] firstArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int index = 0;
        boolean isIdentical = true;

        for (int i = 0; i < firstArray.length; i++) {
            int firstNumber = firstArray[i];
            int secondNumber = secondArray[i];

            if(firstNumber == secondNumber){
                sum += firstNumber;
            }else{
                index = i;
                isIdentical = false;
                break;
            }
        }
        if (isIdentical){
            System.out.printf("Arrays are identical. Sum: %d",sum);
        }else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", index);
        }
    }
}
