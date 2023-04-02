package main.finalExam;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class StringManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        String command = scanner.nextLine();

        while(!command.equals("End")){
            if(command.contains("Translate")){
                String[] newText = command.split(" ");
                inputText.replace(newText[1], newText[2]);
                String currentText = inputText.replace(newText[1], newText[2]);
                System.out.println(currentText);
                inputText = currentText;

            } else if (command.contains("Includes")) {
                String[] newText = command.split(" ");
                String susString = newText[1];
                if(inputText.contains(susString)){
                    System.out.println("True");
                }else{
                    System.out.println("False");
                }
                
            } else if (command.contains("Start")) {
                String[] nexText = command.split(" ");
                String startText = nexText[1];

                if (inputText.startsWith(startText)){
                    System.out.println("True");
                }else{
                    System.out.println("False");
                }
                
            } else if (command.contains("Lowercase")) {
                String toLower = inputText.toLowerCase();
                System.out.println(toLower);
                inputText = toLower;
                
            } else if (command.contains("FindIndex")) {
                String[] newText = command.split(" ");
                char symbol = newText[1].charAt(0);
                int index = inputText.lastIndexOf(symbol);
                System.out.println(index);
                
            } else if (command.contains("Remove")) {
                String[] nexText = command.split(" ");
                int indextStart = Integer.parseInt(nexText[1]);
                int count = Integer.parseInt(nexText[2]);

                StringBuilder sb = new StringBuilder(inputText);
                if (indextStart >= 0 && indextStart + count < inputText.length()) {
                    inputText = sb.delete(indextStart, indextStart + count).toString();
                }
                System.out.println(inputText);
                break;
            }
            command = scanner.nextLine();
        }
    }
}
