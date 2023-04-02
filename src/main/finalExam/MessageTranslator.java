package main.finalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("(?<surrounded>[!])(?<command>[A-Z][a-z]{2,})\\1[:][\\[](?<string>[A-Za-z]{8,})[\\]]");

        for (int i = 0; i < number; i++) {
            Matcher matcher = pattern.matcher(scanner.nextLine());

            if(matcher.find()){
                String command = matcher.group("command");
                String message = matcher.group("string");
                System.out.print(command + ": ");

                for (int j = 0; j < message.length(); j++) {
                    System.out.print((int) message.charAt(j) + " ");
                }
                System.out.println();
            }else{
                System.out.println("The message is invalid");
            }

        }
    }
}
