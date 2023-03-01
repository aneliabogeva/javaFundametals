package main.objectsAndClassesExcersices;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Articles {
    String title;
    String content;
    String author;

    @Override
    public String toString() {
        String message = String.format("%s - %s: %s", title, content, author);
        return message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String edit(String content) {
        return content;
    }

    public String changeAuthor(String author) {
        return author;
    }

    public String renameTitle(String title) {
        return title;
    }


    public Articles(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputArray = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        int number = Integer.parseInt(scanner.nextLine());
        Articles articles = new Articles(inputArray.get(0), inputArray.get(1), inputArray.get(2));

        for(int i = 0; i < number; i++){
            String inputLine = scanner.nextLine();
            String[] inputLineArr = inputLine.split(": ");

            switch (inputLineArr[0]){
                case "Edit":
                    articles.setContent(inputLineArr[1]);
                    break;
                case "ChangeAuthor":
                    articles.setAuthor(inputLineArr[1]);
                    break;
                case "Rename":
                    articles.setTitle(inputLineArr[1]);
                    break;
                default:
                    break;
            }
        }
        System.out.println(articles.toString());
    }
}
