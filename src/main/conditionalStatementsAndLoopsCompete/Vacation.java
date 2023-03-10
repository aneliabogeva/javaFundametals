package main.conditionalStatementsAndLoopsCompete;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();
        double totalPrice = 0.0;
        double finalPrice = 0.0;

        switch (typeOfGroup.toLowerCase()) {
            case "students":
                switch (dayOfTheWeek.toLowerCase()){
                    case "friday":
                        if (numberOfPeople < 30) {
                            totalPrice = numberOfPeople * 8.45;
                        } else {
                            totalPrice = numberOfPeople * 8.45;
                            finalPrice = totalPrice - (totalPrice * 0.15);
                        }
                        break;
                    case "saturday":
                        if (numberOfPeople < 30) {
                            totalPrice = numberOfPeople * 9.80;
                        } else {
                            totalPrice = numberOfPeople * 9.80;
                            finalPrice = totalPrice - (totalPrice * 0.15);
                        }
                        break;
                    case "sunday":
                        if (numberOfPeople < 30) {
                            totalPrice = numberOfPeople * 10.46;
                        } else {
                            totalPrice = numberOfPeople * 10.46;
                            finalPrice = totalPrice - (totalPrice * 0.15);
                        }
                        break;
                }
                break;
            case "business":
                switch (dayOfTheWeek.toLowerCase()){
                    case "friday":
                        if (numberOfPeople < 100) {
                            totalPrice = numberOfPeople * 10.90;
                        } else {
                            totalPrice = (numberOfPeople - 10) * 10.90;
                        }
                        break;
                    case "saturday":
                        if (numberOfPeople < 100) {
                            totalPrice = numberOfPeople * 15.60;
                        } else {
                            totalPrice = (numberOfPeople - 10) * 15.60;
                        }
                        break;
                    case "sunday":
                        if (numberOfPeople < 100) {
                            totalPrice = numberOfPeople * 16.00;
                        } else {
                            totalPrice = (numberOfPeople - 10) * 16.00;
                        }
                        break;
                }
                break;
            case "regular":
                switch (dayOfTheWeek.toLowerCase()){
                    case "friday":
                        if (numberOfPeople < 10) {
                            totalPrice = numberOfPeople * 15.00;
                        } else if (numberOfPeople <= 20) {
                            totalPrice = numberOfPeople * 15.00;
                            finalPrice = totalPrice - (totalPrice * 0.05);
                        } else {
                            totalPrice = numberOfPeople * 15.00;
                        }
                        break;
                    case "saturday":
                        if (numberOfPeople < 10) {
                            totalPrice = numberOfPeople * 20.00;
                        } else if (numberOfPeople <= 20) {
                            totalPrice = numberOfPeople * 20.00;
                            finalPrice = totalPrice - (totalPrice * 0.05);
                        } else {
                            totalPrice = numberOfPeople * 20.00;
                        }
                        break;
                    case "sunday":
                        if (numberOfPeople < 10) {
                            totalPrice = numberOfPeople * 22.50;
                        } else if (numberOfPeople <= 20) {
                            totalPrice = numberOfPeople * 22.50;
                            finalPrice = totalPrice - (totalPrice * 0.05);
                        } else {
                            totalPrice = numberOfPeople * 22.50;
                        }
                        break;
                }
                break;
        }
        if (totalPrice != 0.0 && finalPrice == 0) {
            System.out.printf("Total price: %.2f", totalPrice);
        } else if (finalPrice != 0.0) {
            System.out.printf("Total price: %.2f", finalPrice);
        }
    }
}
