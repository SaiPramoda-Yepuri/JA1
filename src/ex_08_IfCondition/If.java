package ex_08_IfCondition;

import java.util.Scanner;

public class If
{
    public static void main(String[] args) {
        System.out.println("Enter age");
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        if (age>=18){
            System.out.println("Allowed to vote");
        }else {
            System.out.println("Not allowed to vote");
        }
    }
}
