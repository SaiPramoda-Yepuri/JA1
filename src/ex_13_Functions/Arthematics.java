package ex_13_Functions;

import java.util.Scanner;

public class Arthematics {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        if(sc.hasNextInt()){
            int a=sc.nextInt();
        }
        else{
            System.out.println("Enter integers only");
            return;
            //System.exit(0);
        }
        System.out.println("Enter number 2");
        if(sc.hasNextInt()){
            int b=sc.nextInt();
        }
        else {
            System.out.println("Enter integers only");
            return;
            //System.exit(0);
        }
        int result_add = addi(5,4);
        int result_sub=subt(67,45);
        float result_mul=mult(95,12);
        double result_div=divi(13,5);
        long result_modulus=modulus(14,3);

        System.out.println("add: "+result_add);
        System.out.println("Sub: "+result_sub);
        System.out.println("Mul: "+result_mul);;
        System.out.println("Div: "+result_div);
        System.out.println("Modulus: "+result_modulus);
    }
    static int addi(int a,int b){
        return a+b;
    }
    static int subt(int a, int b){
        return a-b;
    }
    static float mult(int a, int b){
        return a*b;
    }
    static double divi(int a, int b){
        return a/b;
    }
    static long modulus(int a, int b){
        return a%b;
    }
}
