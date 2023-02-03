package main.methodsMore;

import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        int n4 = Integer.parseInt(scanner.nextLine());
        getClosedToTheCenterPoint(n1,n2,n3, n4);
    }

    private static void getClosedToTheCenterPoint(int firstNum, int secondNum, int thirdNum, int forthNum)
    {

        int firstResult = Math.max(Math.abs(firstNum), Math.abs(secondNum));
        int secondResult = Math.max(Math.abs(thirdNum), Math.abs(forthNum));


        if(firstResult <= secondResult)
        {
            System.out.printf("(%d, %d)", firstNum, secondNum);
        }
        else
        {
            System.out.printf("(%d, %d)", thirdNum, forthNum);
        }
    }
}
