package ex_16_Arrays;

public class Array_Linear_search {
    public static void main(String[] args) {
        int a[] = {23,456,67,87,32};
        int target = 32;
        //Find target 32, give index;
        for(int i=0;i<a.length;i++){
            if(a[i]== target){
                System.out.println(i);
            }
        }
    }
}
