package ex_02_variables;

public class printF {
    public static void main(String[] args) {
        int a = 10;
        System.out.print("print without line");
        System.out.println("Hello");
        System.out.println("New line");

        System.out.println(a);
        System.out.printf("variable name is %d", a);
        int b=20;
        System.out.println();
        System.out.printf("%d x %d", a,b);
        System.out.println();
    }
}
