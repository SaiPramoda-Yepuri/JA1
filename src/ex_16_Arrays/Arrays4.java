package ex_16_Arrays;

import java.util.Arrays;

public class Arrays4 {
    public static void main(String[] args) {
        int[] marks = {87,90,69,54,88};
        System.out.println("------------");
       // System.out.println(marks); REF address
        for(int i=0; i<marks.length;i++){
            System.out.println(marks[i]);
        }
        Arrays.sort(marks);
        for(int i=0; i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
