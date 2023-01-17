package main.dataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int open = 0;
        int close = 0;

        while(numberOfLines > 0){
            String input = scanner.nextLine();
            if(input.equals("(")){
                open++;
            } else if (input.equals(")")) {
                close++;
                if (open - close != 0)
                {
                    System.out.println("UNBALANCED");
                    return;
                }
            }
            numberOfLines--;
        }

        if (open == close){
            System.out.println("BALANCED");
        }else{
            System.out.println("UNBALANCED");
        }
    }
}
