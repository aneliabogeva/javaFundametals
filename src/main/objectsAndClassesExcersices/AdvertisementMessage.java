package main.objectsAndClassesExcersices;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number = Integer.parseInt(scanner.nextLine());

        List<String> phrases = Arrays.asList("Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.",
                "Exceptional product.", "I can’t live without this product.");

        List<String> events = Arrays.asList("Now I feel good.", "I have succeeded with this product.","Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.","Try it yourself, I am very satisfied.","I feel great!");

        List<String> authors = Arrays.asList("Diana","Petya","Stella","Elena","Katya","Iva","Annie","Eva");

        List<String> cities = Arrays.asList("Burgas","Sofia","Plovdiv","Varna","Ruse");

        for(int i = 1; i <= number; i++){
            Random random = new Random();
            int phrasesIndex = random.nextInt(phrases.size());
            String phrase = phrases.get(phrasesIndex);
            int eventsIndex = random.nextInt(events.size());
            String event = events.get(eventsIndex);
            int authorsIndex = random.nextInt(authors.size());
            String author = authors.get(authorsIndex);
            int citiesIndex = random.nextInt(cities.size());
            String city = cities.get(citiesIndex);

            System.out.printf("%s %s %s - %s%n", phrase, event, author, city);
        }
    }
}
