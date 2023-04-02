package main.textPeocessingExercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();

        int index = inputText.lastIndexOf("\\");
        String nameFile = inputText.substring(index+1);
        int indexExtension = nameFile.lastIndexOf(".") + 1;
        String name = nameFile.substring(0,indexExtension-1);
        String extension = nameFile.substring(indexExtension);

        System.out.printf("File name: %s\n", name);
        System.out.printf("File extension: %s", extension);
    }
}
