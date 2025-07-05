package ex_14_String;

public class More_String_Functions {
    public static void main(String[] args) {
String name = "Honey";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(4));
        //System.out.println(name.charAt(10)); // java.lang.StringIndexOutOfBoundsException

        System.out.println(name.concat("Naini"));
        //3.contains()
        System.out.println(name.contains("om"));
        //4.equals()
        System.out.println(name.equals("Honey"));
        //5.equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("honey"));
        //6.Index of()
        System.out.println(name.indexOf('o'));

        String m = "madam";
        System.out.println(m.indexOf("m"));
        System.out.println(m.lastIndexOf("m"));
        //7.length()
        System.out.println(name.length());
        //8.replace()
        System.out.println(name.replace('n','N'));
        //9.split()
        String name4 = "pramoda@hyd.com@123";
        String[] split_name4 = name4.split("@");
        System.out.println(split_name4[0]);
        System.out.println(split_name4[1]);
        System.out.println(split_name4[2]);



        // 10. substring( , )  , honey
        System.out.println(name.substring(1, 3));

        // 11. toLowerCase()
        System.out.println("HONEY".toLowerCase());

        // 12. toUpperCase()
        System.out.println("honey".toUpperCase());

        // 14. startsWith()
        System.out.println(name.startsWith("H"));

        // 15. endsWith()
        System.out.println(name.endsWith("a"));


        String anotherPalindrome = "Niagara. O roar again!";
        System.out.println(anotherPalindrome.length());

        String extract = anotherPalindrome.substring(11,15);
        System.out.println(extract);

        //        Concatenation (By +)

        String s111 = "Hello";
        String s222 = "World";

        String s333 = "ji";
        String result1 = s111 + s333 + s222;
        System.out.println(result1);

        String n = "PRamoddA";
        System.out.println(n.indexOf("d"));
        System.out.println(n.lastIndexOf("d"));
        System.out.println(n.indexOf("s"));







    }
}
