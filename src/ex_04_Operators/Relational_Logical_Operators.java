package ex_04_Operators;

public class Relational_Logical_Operators {
    public static void main(String[] args) {
        int a = 12;
        int b = 10;
        boolean c = a<b;
        System.out.println(c);

        boolean b1 = true;
        System.out.println(!b1);

        boolean b2 = true;
        System.out.println(!!b2);

        boolean b3 = true || false;
        System.out.println(b3);

        boolean b4 = true && false;
        System.out.println(b4);
        System.out.println("Pramoda" + "YS" + (a+b));

        System.out.println(10==10);
        System.out.println(10<10);
        System.out.println(10==20);
        System.out.println(10>=10);
        System.out.println(!(10>20));

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println( !(5>6 || 6<7));



    }
}
