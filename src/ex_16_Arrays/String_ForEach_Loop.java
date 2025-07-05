package ex_16_Arrays;

public class String_ForEach_Loop {
    public static void main(String[] pramoda) {
        for(int i=0;i< pramoda.length;i++){
            System.out.println(pramoda[i]);
        }
        System.out.println("-------------");
        for(String args:pramoda){
            System.out.println(args);
        }
    }
}
