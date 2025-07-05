package ex_15_StringBuffer_Builder_Functions;

public class StringBuffer_vs_StringBuilder {
    public static void main(String[] args) {
        String s0 = "Pramoda";
        String s1 = new String("Pramoda");

        StringBuffer stringBuffer = new StringBuffer("Pramoda");
        StringBuilder stringBuilder = new StringBuilder("Pramoda");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
    }
}
