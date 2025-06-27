package ex_13_Functions;

public class Method_Parameters {
    public static void main(String[] args) {
     int result = sum(4,5);
     sum_noreturn(3,5);
        System.out.println(result);
    }
    static  int sum(int a, int b){
        return a+b;
    }
    static void sum_noreturn(int a, int b){
        System.out.println(a+b);
    }
}
