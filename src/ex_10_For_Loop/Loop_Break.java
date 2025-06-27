package ex_10_For_Loop;

public class Loop_Break {
    public static void main(String[] args) {
        for (int i=0; i<50; i++){
            if(i==5){
                break;
            }
            else {
                System.out.println(i);
            }
        }
    }
}
