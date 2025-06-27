package ex_10_For_Loop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        if (!sc.hasNextInt()) {
            System.out.println("Enter only numbers");
            return;
        }


        int number = sc.nextInt();
        long factorial = 1;
        if(number<0){
            System.out.println("Please enter positive number");
            return;
        }
        if(number==0){
            System.out.println("0");
            return;
        }else {
        for (int i=1;i<=number;i++){
            factorial=factorial*i;
        }
        System.out.println(factorial);}
    }
}
