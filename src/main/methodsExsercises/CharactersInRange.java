package main.methodsExsercises;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch1 = scanner.next().charAt(0);
        char ch2 = scanner.next().charAt(0);
        getCharacter(ch1, ch2);

    }

    public static void getCharacter(char n1, char n2){
        if(n1 < n2){
            for(int i = n1 +1; i < n2; i++){
                System.out.print((char)i + " ");
            }
        }else{
            for(int i = n2+1; i < n1; i++){
                System.out.print((char)i + " ");
            }
        }

    }
}
