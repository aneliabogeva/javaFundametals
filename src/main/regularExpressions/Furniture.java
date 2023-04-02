package main.regularExpressions;

import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String regex = ">>(?<product>[A-Z]*[a-z]*)<<(?<prize>\\d+\\.?\\d*)!(?<count>\\d+)";

        double result = 0.00;

        List<String> products = new ArrayList<>();

        while (!command.equals("Purchase")){
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(command);

            while (matcher.find()){
                int quantity = Integer.parseInt(matcher.group("count"));
                double prize = Double.parseDouble(matcher.group("prize"));
                result += (prize * quantity);
                products.add(matcher.group("product"));
            }
            command = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String product : products) {
            System.out.println(product);
        }

        System.out.printf("Total money spend: %.2f", result);
    }
}
