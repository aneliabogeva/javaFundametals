package main.methodsExsercises;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        //checkLengthOfPassword(password);
        //checkConsistPassword(password);
        //checkDigitInPass(password);
        String messageLength = checkLengthOfPassword(password);
        String messageConsists = checkConsistPassword(password);
        String messageDigit = checkDigitInPass(password);

        if(!messageLength.equals("")){
            System.out.println(messageLength);
        }
        if(!messageConsists.equals("")){
            System.out.println(messageConsists);
        }
        if(!messageDigit.equals("")){
            System.out.println(messageDigit);
        }
        if(messageConsists.equals("") && messageLength.equals("") && messageDigit.equals("")){
            System.out.println("Password is valid");
        }
    }

    public static String checkLengthOfPassword(String pass) {
        String messageLength = "";
        if (pass.length() < 6 || pass.length() > 10) {
            messageLength = "Password must be between 6 and 10 characters";
        }
        return messageLength;
    }

    public static String checkConsistPassword(String pass) {
        char[] newArray = pass.toCharArray();
        String messageConsists = "";
        for (char c : newArray) {
            if (c < 48 && c < 57) {
                messageConsists = "Password must consist only of letters and digits";
            } else if (c > 90 && c < 97) {
                messageConsists = "Password must consist only of letters and digits";
            } else if (c > 122) {
                messageConsists = "Password must consist only of letters and digits";
            }
        }
        return messageConsists;
    }

    public static String checkDigitInPass(String pass){
        char[] newArray = pass.toCharArray();
        String messageDigit = "";
        int counter = 0;
        for (int i = 0; i < newArray.length; i++){
            if(newArray[i] >= 48 && newArray[i] <= 57){
                counter+=1;
            }
        }
        if(counter < 2){
            messageDigit = "Password must have at least 2 digits";
        }
        return messageDigit;
    }
}
