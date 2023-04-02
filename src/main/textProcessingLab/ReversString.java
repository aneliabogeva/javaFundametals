package main.textProcessingLab;

import java.util.Scanner;

public class ReversString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        while(!command.equals("end")){
            String reversedCommand = "";
            for(int i = command.length()-1; i >= 0; i--){
                char symbol = command.charAt(i);
                reversedCommand += symbol;
            }
            System.out.printf("%s = %s\n", command, reversedCommand);
            command = scanner.nextLine();
        }
    }
}
