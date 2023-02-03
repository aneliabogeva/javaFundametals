package main.methodsMore;

import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        getSignOfMultiplication(number1, number2, number3);
    }

    public static void getSignOfMultiplication(int n1, int n2, int n3){
        if (n1==0 || n2==0 || n3==0)
        {
            System.out.println("zero");
        }

        else if ((n1>0 && n2>0 && n3>0) || (n1<0 && n2<0 && n3>0) || (n1<0 && n2>0 && n3<0) || (n1>0 && n2<0 && n3<0))
        {
            System.out.println("positive");
        }
        else
        {
            System.out.println("negative");
        }
    }
}
