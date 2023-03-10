package main.exerciseDataTypesAndVariables;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        double maxVolume = Double.MIN_VALUE;
        String message = "";

        for(int i = 0; i< number; i++){
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * Math.pow(radius,2) * height;
            if(maxVolume < volume){
                maxVolume = volume;
                message = model;
            }
        }
        System.out.printf("%s", message);
    }
}
