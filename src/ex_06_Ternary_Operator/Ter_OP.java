package ex_06_Ternary_Operator;

public class Ter_OP {
    public static void main(String[] args) {
        int age=10;
        String canIVote = age>18?"Yes":"No";
        System.out.println(canIVote);

        int n = -8;
        String result = n>0? "Positive":"Negative";
        System.out.println(result);
    }
}
