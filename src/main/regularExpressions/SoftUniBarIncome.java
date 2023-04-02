package main.regularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double totalIncome = 0.0;

        String regex = "^%(?<name>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.*[0-9]*)\\$$";


        while(!command.equals("end of shift")){
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(command);
            double totalAmount = 0.00;

            while (matcher.find()){
                String name = matcher.group("name");
                String product = matcher.group("product");
                double price = Double.parseDouble(matcher.group("price"));
                totalAmount = Double.parseDouble(matcher.group("count")) * price;
                System.out.printf("%s: %s - %.2f%n", name, product, totalAmount);
            }
            totalIncome += totalAmount;
            command = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalIncome);
    }
}
