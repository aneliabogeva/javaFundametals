package main.arraysExercise;

import java.util.Scanner;

import static java.util.Arrays.*;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] integerArray = stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();

        for (int i = 0; i < integerArray.length; i++){

            while (!command.equals("end")){
                if(command.contains("swap")){
                    String[] swapArray = command.split(" ");
                    int firstIndex = Integer.parseInt(swapArray[1]);
                    int secondIndex = Integer.parseInt(swapArray[2]);
                    int firstChangeNumber = integerArray[firstIndex];
                    int secondChangeNumber = integerArray[secondIndex];
                    integerArray[firstIndex] = secondChangeNumber;
                    integerArray[secondIndex] = firstChangeNumber;
                } else if (command.contains("multiply")) {
                    String[] multiArray = command.split(" ");
                    int firstIndex = Integer.parseInt(multiArray[1]);
                    int secondIndex = Integer.parseInt(multiArray[2]);
                    integerArray[firstIndex] = integerArray[firstIndex]*integerArray[secondIndex];
                }else if(command.contains("decrease")){
                    for (int j = 0; j < integerArray.length; j++) {
                        integerArray[j] -=1;
                    }
                }
                command = scanner.nextLine();
            }
        }
        for (int i = 0; i < integerArray.length; i++){
            if(i == integerArray.length - 1){
                System.out.printf("%d ", integerArray[i]);
            }else{
                System.out.printf("%d, ", integerArray[i]);
            }
        }
    }
}
