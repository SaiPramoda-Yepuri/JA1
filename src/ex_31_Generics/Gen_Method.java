package ex_31_Generics;

public class Gen_Method {
    public static void main(String[] args) {
        display(3,4);
        display(3.14,4.45);
        display("pramoda","ys");

    }

    /*static <T> T display(T a,T b, T c) {
        System.out.println(a);
        System.out.println(b);
        return null;
    }*/


    static <T> void display(T a,T b) {
        System.out.println(a);
        System.out.println(b);
    }
}
