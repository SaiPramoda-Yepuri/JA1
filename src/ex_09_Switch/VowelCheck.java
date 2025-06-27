package ex_09_Switch;

import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet");
        char ch = sc.next().toLowerCase().charAt(0);

        switch (ch){
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
            default -> System.out.println("Consonant");
        }
    }
}
