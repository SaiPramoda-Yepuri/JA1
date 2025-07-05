package ex_14_String;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.next();

        String reverse_string = reverseStringSB(input);
        if(reverse_string.equalsIgnoreCase(input)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
    static String reverseString(String userInput){
        String reversed ="";
        for(int i=userInput.length()-1;i>=0;i--){
            reversed = reversed+userInput.charAt(i);
        }
        return reversed;
    }
    static String reverseStringSB(String userInput){
        StringBuilder sb = new StringBuilder(userInput);
        return sb.reverse().toString();
    }
}
