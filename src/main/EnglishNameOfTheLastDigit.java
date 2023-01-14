package main;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String digit = scanner.nextLine();
        char lastDigit = 0;
        String mes =null;

        for(int i = 0; i < digit.length(); i++){
            lastDigit = digit.charAt(i);
        }
        switch (Integer.parseInt(String.valueOf(lastDigit))){
            case 1:
                mes = "one";
                break;
            case 2:
                mes = "two";
                break;
            case 3:
                mes = "three";
                break;
            case 4:
                mes = "four";
                break;
            case 5:
                mes = "five";
                break;
            case 6:
                mes = "six";
                break;
            case 7:
                mes = "seven";
                break;
            case 8:
                mes = "eight";
                break;
            case 9:
                mes = "nine";
                break;
            case 0:
                mes = "zero";
                break;
        }
        System.out.println(mes);
    }
}
