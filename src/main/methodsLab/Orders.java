package main.methodsLab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        orders(product, quantity);
    }

    public static void orders(String pr, double quantity){
        switch(pr){
            case "coffee":
                System.out.printf("%.2f",quantity * 1.50);
                break;
            case "water":
                System.out.printf("%.2f",quantity);
                break;
            case "coke":
                System.out.printf("%.2f",quantity * 1.40);
                break;
            case "snacks":
                System.out.printf("%.2f",quantity * 2.00);
                break;
            default:
                break;
        }
    }
}
