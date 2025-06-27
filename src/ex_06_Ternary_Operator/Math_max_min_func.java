package ex_06_Ternary_Operator;

public class Math_max_min_func {
    public static void main(String[] args) {
        int x = 10;
        int y= 20;
        System.out.println(Math.max(x,y));

        int min = x<y?x:y;
        System.out.println(min);

        int max = x>y?x:y;
        System.out.println(max);
    }
}
