package main.methodsMore;

import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());
        int x4 = Integer.parseInt(scanner.nextLine());
        int y4 = Integer.parseInt(scanner.nextLine());

        int line1 = GetDistanceBetweenTwoPoints(x1, y1, x2, y2);
        int line2 = GetDistanceBetweenTwoPoints(x3, y3, x4, y4);

        boolean line1Point1IsCloserToZero = aPointCloserToTheZero(x1, y1, x2, y2);
        boolean line2Point1IsCloserToZero = aPointCloserToTheZero(x3, y3, x4, y4);

        if (line1 >= line2) {
            if (line1Point1IsCloserToZero) {
                System.out.printf("(%d, %d)(%d, %d)", x1, y1, x2, y2);
            } else {
                System.out.printf("(%d, %d)(%d, %d)", x2, y2, x1, y1);
            }
        } else {
            if (line2Point1IsCloserToZero) {
                System.out.printf("(%d, %d)(%d, %d)", x3, y3, x4, y4);
            } else {
                System.out.printf("(%d, %d)(%d, %d)", x4, y4, x3, y3);
            }
        }

    }

    private static int GetDistanceBetweenTwoPoints(int x1, int y1, int x2, int y2) {
        int sideA = Math.abs(x2 - x1);
        int sideB = Math.abs(y2 - y1);

        return (int) Math.sqrt((sideA * sideA) + (sideB * sideB));
    }

    private static boolean aPointCloserToTheZero(int x1, int y1, int x2, int y2) {
        int c1 = (int) GetHypotenuse(x1, y1);
        int c2 = (int) GetHypotenuse(x2, y2);

        boolean result = c2 >= c1;

        return result;
    }

    private static double GetHypotenuse(int a, int b) {

        return (int) Math.sqrt((a * a) + (b * b));
    }
}
