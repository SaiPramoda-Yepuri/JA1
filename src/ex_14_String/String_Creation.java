package ex_14_String;

public class String_Creation {
    public static void main(String[] args) {
        //2 ways we can create String
        String s1 = "Pramoda"; //Literal, direct initialization
        s1 = "YS";
        System.out.println(s1);
        s1 = s1.concat(".Pramoda");
        System.out.println(s1);
        String s2 = new String("Pramoda"); // Object
        s2 = new String("YS");
        System.out.println(s2);
    }
}
