package main.exerciseDataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < number; i++){
            int liters = Integer.parseInt(scanner.nextLine());
            if(sum + liters <= 255){
                sum += liters;
            }else{
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.printf("%d", sum);
    }
}
