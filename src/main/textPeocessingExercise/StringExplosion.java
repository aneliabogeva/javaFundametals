package main.textPeocessingExercise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        char[] charLine = line.toCharArray();
        int power = 0;

        for (int i = 0; i < charLine.length; i++) {

            if (charLine[i] == '>') {
                String num = Character.toString(charLine[i + 1]);
                power += Integer.parseInt(num);
            } else {
                if (power > 0) {
                    charLine[i] = '0';
                    power--;
                }

            }
        }
        String sentenceOfChars = getTheWord(charLine);

        sentenceOfChars = sentenceOfChars.replaceAll("[0]", "");

        System.out.println(sentenceOfChars);

    }

    private static String getTheWord(char[] charLine) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charLine.length; i++) {
            sb.append(charLine[i]);
        }
        return sb.toString();
    }
}
