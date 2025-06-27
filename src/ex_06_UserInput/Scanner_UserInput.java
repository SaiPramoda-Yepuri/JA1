package ex_06_UserInput;

import java.util.Scanner;

public class Scanner_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* System.out.println("Enter the age");
        int age = sc.nextInt();
        String canIVote = age>=18 ? "Yes" : "No";
        System.out.println(canIVote);*/

        // String, Int, Double
        System.out.println("Enter string");
        String s = sc.next();
        System.out.println(s);

        System.out.println("Enter int");
        int i = sc.nextInt();

        System.out.println("Enter double");
        double d = sc.nextDouble();
        System.out.println(d);



    }
}
