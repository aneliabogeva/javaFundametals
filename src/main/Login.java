package main;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String password = scanner.nextLine();
        char ch;
        StringBuilder newString = new StringBuilder();
        int counter = 0;

        for(int i = 0; i < userName.length(); i++){
            ch = userName.charAt(i);
            newString.insert(0, ch);
        }

        while(!newString.toString().equals(password)){
            System.out.println("Incorrect password. Try again.");
            counter +=1;
            if (counter < 3){
                password = scanner.nextLine();
            }else{
                System.out.printf("User %s blocked!", userName);
                break;
            }
        }
        if(newString.toString().equals(password)){
            System.out.printf("User %s logged in.", userName);
        }
    }
}
