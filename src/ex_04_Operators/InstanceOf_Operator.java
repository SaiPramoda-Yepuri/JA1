package ex_04_Operators;

public class InstanceOf_Operator {
    public static void main(String[] args) {
        String s = new String("Pramoda");
        System.out.println(s instanceof String);

        boolean b = (10==11);
        System.out.println(b);
        long l = 12l;
        System.out.println(l);
        char a='A';
        char c='B';
        System.out.println(a+c);
        System.out.println('A' == 65);
        short s2 = 10;
        char d='A';
        String s1 = "A";
        System.out.println(s2+d);
        System.out.println(d);
        System.out.println(d+d);
        System.out.println(d+s1);
    }
}
