package ex_14_String;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input!");
        String input = sc.next();
        int vowels = 0;
        int cons = 0;
        input = input.toLowerCase();
        System.out.println(input);

        for(int i =0; i<input.length();i++){
            char ch = input.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }else{
                cons++;
            }
        }

        System.out.println("Number of vowels = "+vowels);
        System.out.println("Number of consonants = "+cons);
    }
}
