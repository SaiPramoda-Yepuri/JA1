package ex_13_Functions;

public class parameters_with_without {
    public static void main(String[] args) {
        wop_wor();
        String msg = wop_wr();
        System.out.println(msg);
        wp_wor("Pramoda",33, 1000);
        wp_wor("HN",6, 0);
        int sum = wp_wr(5,6,7);
        System.out.println(sum);

    }
    static void wop_wor(){
        System.out.println("Type 1 -> Without param and without return type ");
    }
    static String wop_wr(){
        System.out.println("Type 2 -> Without param and with return type ");
        return "Hi, how are you?";

    }
    static void wp_wor(String name, int age, double salary){
        System.out.println("Name is ->"+name+"\nAge "+age+"\n Salary "+salary);
    }
    static int wp_wr(int a, int b, int c){
        return a+b+c;
    }

}
