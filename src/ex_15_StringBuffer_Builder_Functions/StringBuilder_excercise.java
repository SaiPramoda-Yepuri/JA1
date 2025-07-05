package ex_15_StringBuffer_Builder_Functions;

public class StringBuilder_excercise {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Pramoda");
        sb.append(123);

        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" World");
        sb2.reverse();
        System.out.println(sb2);
    }
}
