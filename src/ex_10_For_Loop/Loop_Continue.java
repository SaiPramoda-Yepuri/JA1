package ex_10_For_Loop;

public class Loop_Continue {
    public static void main(String[] args) {
        for(int i=0; i<50;i++){
            if (i==5){
                continue;// skip the value at that condition and move to next
            }
            System.out.println(i);
        }
        for (int b=0;b<=50;b++) {
            if (b % 2 == 0) {
                continue;
            }
            System.out.println("Odd no's ->" + b);
        }
    }
}
