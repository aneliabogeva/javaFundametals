package main.arraysExercise;

import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] treasureChest = scanner.nextLine().split("\\|");
        String[] command = scanner.nextLine().split(" ");
        String[] newArray = new String[treasureChest.length + 1];
        boolean isPresented = false;
        double sum = 0.0;


        while (!command[0].equals("Yohoho!")) {
            if (command[0].contains("Loot")) {
                for (int i = 1; i < command.length; i++) {
                    var checkedElement = command[i];
                    for (int j = 0; j < treasureChest.length; j++) {
                        if (checkedElement.equals(treasureChest[j])) {
                            isPresented = true;
                        }
                    }
                    if (!isPresented) {
                        newArray[0] = checkedElement;
                        System.arraycopy(treasureChest, 0, newArray, 1, treasureChest.length);
                    } else {
                        isPresented = false;
                        treasureChest = newArray;
                        newArray = new String[treasureChest.length + 1];
                    }
                }

            } else if (command[0].contains("Drop")) {
                //treasureChest = newArray;
                //newArray = new String[treasureChest.length];
                int index = Integer.parseInt(command[1]);

                if(index < 0){
                    newArray = treasureChest;
                    //newArray = new String[treasureChest.length];
                }else {
                    treasureChest = newArray;
                    newArray = new String[treasureChest.length];
                    String elementOnParticularIndex = treasureChest[index];

                    System.arraycopy(treasureChest, 0, newArray, 0, index);
                    for (int m = index; m < treasureChest.length - 1; m++) {
                        var elementToBereplaced = newArray[index];
                        var replacedWith = treasureChest[index + 1];
                        newArray[m] = treasureChest[m + 1];
                    }
                    newArray[newArray.length - 1] = elementOnParticularIndex;
                    treasureChest = newArray;
                }

            } else if (command[0].contains("Steal")) {
                int stealElementsNumber = Integer.parseInt(command[1]);
                if (stealElementsNumber < treasureChest.length) {
                    newArray = new String[treasureChest.length - stealElementsNumber];
                    System.arraycopy(treasureChest, 0, newArray, 0, newArray.length);
                    String[] stolenElements = new String[stealElementsNumber];
                    for (int k = 0; k < stolenElements.length; k++) {
                        stolenElements[stolenElements.length - 1 - k] = treasureChest[(treasureChest.length - 1) - k];
                    }
                    for(int m = 0; m < stolenElements.length; m++){
                        if(m == stolenElements.length-1){
                            System.out.println(stolenElements[stolenElements.length - 1]);
                        }else {
                            System.out.print(stolenElements[m] + ", ");
                        }
                    }

                } else {
                    newArray = new String[0];
                    for (int i = 0; i < treasureChest.length; i++) {
                        if(i == treasureChest.length-1){
                            System.out.print(treasureChest[i]);
                        }else{
                            System.out.print(treasureChest[i] + ", ");
                        }
                    }
                }
            }
            command = scanner.nextLine().split(" ");
        }
        treasureChest = newArray;
        if (treasureChest.length == 0) {
            System.out.print("Failed treasure hunt.");
        } else {
            for (int i = 0; i < treasureChest.length; i++) {
                sum += treasureChest[i].length();
            }
            double finalSum = sum / treasureChest.length;
            System.out.printf("%nAverage treasure gain: %.2f pirate credits.", finalSum);
        }
    }
}
