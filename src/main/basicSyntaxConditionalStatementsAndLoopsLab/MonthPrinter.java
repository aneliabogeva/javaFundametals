package main.basicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;
public class MonthPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = Integer.parseInt(scanner.nextLine());
        String name;

            switch (month){
                case 1:
                    name ="January";
                    break;
                case 2:
                    name ="February";
                    break;
                case 3:
                    name = "March";
                    break;
                case 4:
                    name = "April";
                    break;
                case 5:
                    name = "May";
                    break;
                case 6:
                    name = "June";
                    break;
                case 7:
                    name = "July";
                    break;
                case 8:
                    name = "August";
                    break;
                case 9:
                    name = "September";
                    break;
                case 10:
                    name = "October";
                    break;
                case 11:
                    name = "November";
                    break;
                case 12:
                    name = "December";
                    break;
                default:
                    name = "Error!";
                    break;
            }
        System.out.println(name);
        }
}
