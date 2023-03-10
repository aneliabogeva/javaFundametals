package main.arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String[] newArray = new String[number];
        double sum = 0.0;
        int[] finalArray = new int[number];

        for(int i = 0; i < newArray.length; i++){
            newArray[i] = scanner.nextLine();
        }

        for(int i = 0; i < newArray.length; i++){
            String word = newArray[i];
            for(int j = 0; j < word.length(); j++){
                char[] charArray = word.toCharArray();
                if((int)charArray[j] == 65 || (int)charArray[j] == 69 || (int)charArray[j] == 73 || (int)charArray[j] == 49 || (int)charArray[j] == 97 ||
                        (int)charArray[j] == 101 || (int)charArray[j] == 105 || (int)charArray[j] == 111){
                    sum += charArray[j] * word.length();
                }else {
                    sum += charArray[j] / word.length();
                }
            }
            finalArray[i] = (int)sum;
            sum = 0.0;
        }
        Arrays.sort(finalArray);
        for (int j : finalArray) {
            System.out.println(j);
        }
    }
}
