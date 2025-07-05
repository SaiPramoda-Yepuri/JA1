package ex_16_Arrays;

import java.util.Arrays;

public class Array_2nd_Highest {
    public static void main(String[] args) {
        int a[] = {676,67,90,45,12};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println(a[a.length-2]);
        System.out.println(a[a.length-3]);
    }
}
