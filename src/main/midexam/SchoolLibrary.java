package main.midexam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SchoolLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shelfWithBooks = Arrays.stream(scanner.nextLine().split("&")).collect(Collectors.toList());
        List<String> command = Arrays.stream(scanner.nextLine().split(" \\| ")).collect(Collectors.toList());
        String book = "";
        
        while (!command.get(0).equals("Done")){
            String action = command.get(0);
            switch (action){
                case "Add Book":
                    if(shelfWithBooks.contains(command.get(1))){
                    }else{
                        shelfWithBooks.remove(0);
                        shelfWithBooks.add(0, command.get(1));
                    }
                    break;
                case "Take Book":
                    if (shelfWithBooks.contains(command.get(1))){
                        shelfWithBooks.remove(command.get(1));
                    }
                    break;
                case "Swap Books":
                    if(shelfWithBooks.contains(command.get(1)) && shelfWithBooks.contains(command.get(2))){
                        int indexFirst = shelfWithBooks.indexOf(command.get(1));
                        int indexSecond = shelfWithBooks.indexOf(command.get(2));
                        shelfWithBooks.remove(indexFirst);
                        shelfWithBooks.remove(indexSecond-1);
                        shelfWithBooks.add(indexFirst, command.get(2));
                        shelfWithBooks.add(indexSecond, command.get(1));
                    }
                    break;
                case "Insert Book":
                    if(!shelfWithBooks.contains(command.get(1))){
                        shelfWithBooks.add(command.get(1));
                    }
                    break;
                case "Check Book":
                    int index = Integer.parseInt(command.get(1));
                    if(index <= shelfWithBooks.size()){
                        book = shelfWithBooks.get(index);
                        System.out.println(book);
                    }
                    break;
                default:
                    break;
            }
            command = Arrays.stream(scanner.nextLine().split(" \\| ")).collect(Collectors.toList());
        }
        String names = String.join(", ", shelfWithBooks);
        System.out.println(names);
    }
}
