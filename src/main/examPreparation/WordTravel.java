package main.examPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class WordTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String allStops = scanner.nextLine();
        StringBuilder stopsBuilder = new StringBuilder(allStops);
        String[] command = scanner.nextLine().split(":");

        while(!command[0].equals("Travel")){


            if(command[0].equals("Add Stop")){
                int index = Integer.parseInt(command[1]);
                String newStop = command[2];

                if(index >= 0 && index < stopsBuilder.length()-1){
                    stopsBuilder.insert(index, newStop);
                }

            }else if(command[0].equals("Remove Stop")){
                int startIndex = Integer.parseInt(command[1]);
                int stopIndex = Integer.parseInt(command[2]);

                if(startIndex >= 0 && startIndex <= stopsBuilder.length()-1 &&
                stopIndex >= 0 && stopIndex <= stopsBuilder.length()-1){
                    stopsBuilder.delete(startIndex, stopIndex+1);
                }

            }else if(command[0].equals("Switch")){
                String oldValue = command[1];
                String newValue = command[2];

                String currentText = stopsBuilder.toString().replace(oldValue, newValue);
                stopsBuilder = new StringBuilder(currentText);
            }
            System.out.println(stopsBuilder);
            command = scanner.nextLine().split(":");
        }
        System.out.println("Ready for world tour! Planned stops: " + stopsBuilder);
    }
}
