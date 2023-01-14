package main;

import java.util.Scanner;

public class Lab01TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int price = 0;
        String message = null;

        switch (day.toLowerCase()){
            case "weekday":
                if((age >= 0 && age <= 18) || (age > 64 && age <= 122)){
                  price = 12;
                } else if (age > 18 && age <= 64) {
                    price = 18;
                }  else{
                    message = "Error!";
                }
                break;
            case "weekend":
                if((age >= 0 && age <= 18) || (age > 64 && age <= 122)){
                    price = 15;
                } else if (age > 18 && age <= 64) {
                    price = 20;
                } else{
                    message = "Error!";
                }
                break;
            case "holiday":
                if(age >= 0 && age <= 18){
                    price = 5;
                } else if (age > 18 && age <= 64) {
                    price = 12;
                } else if (age > 64 && age <= 122) {
                    price = 10;
                } else{
                    message = "Error!";
                }
                break;
            default:
                message = "Error!";
                break;
        }

        if(price != 0){
            System.out.printf("%d$", price);
        }else{
            System.out.println(message);
        }
    }
}
