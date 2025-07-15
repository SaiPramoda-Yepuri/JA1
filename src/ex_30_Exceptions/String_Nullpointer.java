package ex_30_Exceptions;

public class String_Nullpointer {
    public static void main(String[] args) {
        String name= null; // java.lang.NullPointerException
        name.trim();
    }
}
