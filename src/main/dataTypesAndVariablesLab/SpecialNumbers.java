package main.dataTypesAndVariablesLab;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for(int i = 1; i <=n ; i++){
            if(i < 10){
                sum += i;
                if(sum == 5 || sum == 7){
                    System.out.printf("%d -> True\n", i);
                }else{
                    System.out.printf("%d -> False\n", i);
                }
                sum = 0;
            }else{
                sum = sum + (i %10) + (i / 10);
                if(sum == 5 || sum == 7 || sum == 11){
                    System.out.printf("%d -> True\n", i);
                }else{
                    System.out.printf("%d -> False\n", i);
                }
                sum = 0;
            }
        }
    }
}
