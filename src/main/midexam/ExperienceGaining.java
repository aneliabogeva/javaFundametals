package main.midexam;

import java.util.Scanner;

public class ExperienceGaining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer amountOfExperience = Integer.parseInt(scanner.nextLine());
        Integer countOfBattles = Integer.parseInt(scanner.nextLine());
        boolean ifYes = false;
        double sum = 0;
        int counter = 0;

        for(int i = 1; i <= countOfBattles; i++){
            Double gainAmount = Double.parseDouble(scanner.nextLine());
            if(i == 3 || i == 15) {
                gainAmount = (gainAmount * 0.15) + gainAmount;
                sum += gainAmount;
                counter += 1;
            } else if (i == 5) {
                gainAmount = gainAmount - (gainAmount * 0.10);
                sum += gainAmount;
                counter += 1;
            }else {
                sum += gainAmount;
                counter += 1;
            }
            if(sum >= amountOfExperience){
                System.out.printf("Player successfully collected his needed experience for %d battles.", counter);
                ifYes = true;
                break;
            }
        }
        if(!ifYes){
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", amountOfExperience - sum);
        }
    }
}
