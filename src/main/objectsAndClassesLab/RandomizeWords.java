package main.objectsAndClassesLab;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        Random random = new Random();

        for (int i = 0; i < input.length; i++){
            int indexX = random.nextInt(input.length);
            int indexY = random.nextInt(input.length);

            String oldWord = input[indexX];
            input[indexX] = input[indexY];
            input[indexY] = oldWord;
        }
        System.out.println(String.join(System.lineSeparator(), input));
    }
}
