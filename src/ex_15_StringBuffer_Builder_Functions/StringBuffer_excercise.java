package ex_15_StringBuffer_Builder_Functions;

public class StringBuffer_excercise {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Pramoda");
        stringBuffer.append(" YS");
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.reverse());

        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1+s2;

        System.out.println(s3);
        System.out.println(s1);

        StringBuffer sb2 = new StringBuffer("Java");
        sb2.append("Programming");
        System.out.println(sb2);
        sb2.delete(5,16); // Delete sub-string
        System.out.println(sb2);
        sb2.replace(0,4,"C++");
        System.out.println(sb2);
    }
}
