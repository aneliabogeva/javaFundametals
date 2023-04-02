package main.examPreparation;

import java.util.*;

public class NeedForSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> mapCars = new LinkedHashMap<>();

        for(int i = 0; i < number; i++){
            String[] car = scanner.nextLine().split("\\|");

            String model = car[0];
            int distance = Integer.parseInt(car[1]);
            int fuel = Integer.parseInt(car[2]);

            List<Integer> carVariables = new ArrayList<>();
            carVariables.add(0, distance);
            carVariables.add(1, fuel);

            mapCars.put(model,carVariables);
        }

        String command = scanner.nextLine();
        while(!command.equals("Stop")){
            String[] commandSplit = command.split(" : ");
            String car = commandSplit[1];
            int fuelCurrent = mapCars.get(car).get(1);
            int distanceCurrent = mapCars.get(car).get(0);
            List<Integer> newValues = new ArrayList<>();

            if(command.contains("Drive")){

                int distance = Integer.parseInt(commandSplit[2]);
                int fuelNeeded = Integer.parseInt(commandSplit[3]);

                if (fuelNeeded > fuelCurrent){
                    System.out.println("Not enough fuel to make that ride");
                }else{
                    int currentDistance = mapCars.get(car).get(0);

                    newValues.add(0, currentDistance + distance);
                    newValues.add(1,fuelCurrent - fuelNeeded);
                    mapCars.put(car, newValues);
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuelNeeded);
                    if (currentDistance + distance > 100000){
                        System.out.printf("Time to sell the %s%n!", car);
                    }
                }

            } else if (command.contains("Refuel")) {
                int fuelForRefuel = Integer.parseInt(commandSplit[2]);
                if(fuelForRefuel + fuelCurrent >75){
                    System.out.printf("%s refueled with %d liters%n", car, 75 - fuelCurrent);
                    fuelCurrent = 75;
                    newValues.add(0, distanceCurrent);
                    newValues.add(1, fuelCurrent);
                    mapCars.put(car, newValues);
                }else{
                    System.out.printf("%s refueled with %d liters%n", car, fuelForRefuel);
                    int newFuel = fuelCurrent + fuelForRefuel;
                    newValues.add(0, distanceCurrent);
                    newValues.add(1, newFuel);
                    mapCars.put(car, newValues);
                }

            }else if(command.contains("Revert")){
                int reversDistance = Integer.parseInt(commandSplit[2]);
                int newDistance = distanceCurrent - reversDistance;
                if(newDistance < 10000){
                    newDistance = 10000;
                    newValues.add(0, newDistance);
                    newValues.add(1, fuelCurrent);
                    mapCars.put(car, newValues);
                }else{
                    newValues.add(0, newDistance);
                    newValues.add(1, fuelCurrent);
                    mapCars.put(car, newValues);
                    System.out.printf("%s mileage decreased by %d kilometers%n", car, reversDistance);
                }
            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<Integer>> entry : mapCars.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
        }


    }
}
