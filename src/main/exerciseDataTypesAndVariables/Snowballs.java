package main.exerciseDataTypesAndVariables;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfBalls = Integer.parseInt(scanner.nextLine());
        long bestSnowBall = Integer.MIN_VALUE;
        long snowballValue;
        int finalSnowballSnow = 0;
        int finalSnowballTime = 0;
        int finalSnowballQuality = 0;

        for(int i = 1; i <= numberOfBalls; i++){
             int snowballSnow = Integer.parseInt(scanner.nextLine());
             int snowballTime = Integer.parseInt(scanner.nextLine());
             int snowballQuality = Integer.parseInt(scanner.nextLine());
             int result = snowballSnow/snowballTime;

            snowballValue = (long) Math.pow(result,snowballQuality);
            if(snowballValue >= bestSnowBall){
                bestSnowBall = snowballValue;
                finalSnowballSnow = snowballSnow;
                finalSnowballTime = snowballTime;
                finalSnowballQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %d (%d)", finalSnowballSnow, finalSnowballTime, bestSnowBall, finalSnowballQuality);
    }
}
