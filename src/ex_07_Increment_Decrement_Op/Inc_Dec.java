package ex_07_Increment_Decrement_Op;

public class Inc_Dec {
    public static void main(String[] args) {
        int a = 10;
        //int b = ++a;
        System.out.println(a++); // post increment first print and then increment
        System.out.println(a);
        System.out.println(a++ + a);
    }
}
