package ex_09_Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day 1 to 7 ");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
               break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Not allowed");
                break;
        }
    }
}
