package main;

import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        String message;

        if(age >= 0 && age <= 2){
            message = "baby";
        }else if(age >= 3 && age <= 13){
            message = "child";
        } else if (age >= 14 && age <= 19) {
            message = "teenager";
        } else if (age >= 20 && age <= 65 ) {
            message = "adult";
        }else {
            message = "elder";
        }
        System.out.println(message);
    }
}
