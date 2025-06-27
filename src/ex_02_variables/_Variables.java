package ex_02_variables;

public class _Variables {
    public static void main(String[] args) {
        int a = 10;
        {
            int b = 10;
            System.out.println(b);
        }
        int b = 90;
        System.out.println(b);
        short s = 10;
        long l = 123213343253454L;
        float f = 31.33F;
        double d = 59.765768;
        boolean b1 = true;
        char c = 'A';
        int local;
        //System.out.println(local);
        System.out.println("Long:"+l);
        System.out.println("Float:"+f);
        System.out.println("Double:"+d);
        System.out.println("Char:"+c);
        System.out.println("Boolean:"+b1);
        System.out.println("Short:"+s);
        System.out.println("Global variable:"+b);
    }
}
