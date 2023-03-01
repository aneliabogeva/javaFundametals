package main.midexam;

import java.util.*;
import java.util.stream.Collectors;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> vehicles = Arrays.stream(scanner.nextLine().split(">>")).collect(Collectors.toList());
        double sumOfTax = 0.0;
        double totalSum = 0.0;

        for(int i = 0; i < vehicles.size(); i++){
            String sepVehicle = vehicles.get(i);
            List<String> sepVehicleParam = Arrays.stream(sepVehicle.split(" ")).collect(Collectors.toList());
            if(sepVehicleParam.get(0).equals("family")){
                Integer yearsForDecline = Integer.parseInt(sepVehicleParam.get(1));
                Integer taxForKm = Integer.parseInt(sepVehicleParam.get(2)) / 3000;
                sumOfTax = taxForKm * 12 + (50 - yearsForDecline * 5);
                System.out.printf("A %s car will pay %.2f euros in taxes.%n", sepVehicleParam.get(0), sumOfTax);
                totalSum += sumOfTax;
            }else if (sepVehicleParam.get(0).equals("heavyDuty")){
                Integer yearsForDecline = Integer.parseInt(sepVehicleParam.get(1));
                Integer taxForKm = Integer.parseInt(sepVehicleParam.get(2)) / 9000;
                sumOfTax = taxForKm * 14 + (80 - yearsForDecline * 8);
                System.out.printf("A %s car will pay %.2f euros in taxes.%n", sepVehicleParam.get(0), sumOfTax);
                totalSum += sumOfTax;
            } else if (sepVehicleParam.get(0).equals("sports")) {
                Integer yearsForDecline = Integer.parseInt(sepVehicleParam.get(1));
                Integer taxForKm = Integer.parseInt(sepVehicleParam.get(2)) / 2000;
                sumOfTax = taxForKm * 18 + (100 - yearsForDecline * 9);
                System.out.printf("A %s car will pay %.2f euros in taxes.%n", sepVehicleParam.get(0), sumOfTax);
                totalSum += sumOfTax;
            }else{
                System.out.println("Invalid car type.");
            }
        }
        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.", totalSum);
    }
}
