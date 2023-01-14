package main;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;

        if(n1>n2){
            if(n1>n3){
                firstNumber = n1;
                {
                    if(n2>n3){
                        secondNumber=n2;
                        thirdNumber=n3;
                    }else {
                        secondNumber=n3;
                        thirdNumber=n2;
                    }
                }
            }else {
                firstNumber = n3;
                secondNumber = n1;
                thirdNumber = n2;
            }
        } else if (n2>n3) {
            firstNumber=n2;
            if(n1>n3){
                secondNumber=n1;
                thirdNumber=n3;
            }else{
                secondNumber=n3;
                thirdNumber=n1;
            }
        }

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
    }
}
