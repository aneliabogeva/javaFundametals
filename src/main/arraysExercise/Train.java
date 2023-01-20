package main.arraysExercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersOfWagon = Integer.parseInt(scanner.nextLine());
        int[] arrayWagon = new int[numbersOfWagon];
        int sum = 0;

        for(int i = 0; i < numbersOfWagon; i++){
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            arrayWagon[i] = number;
        }
        for (int i = 0; i < arrayWagon.length; i++) {
            System.out.print(arrayWagon[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
