package ex_16_Arrays;

public class Arrays_Max_Min {
    public static void main(String[] args) {
        int[] array = {23,45,67,19,24,76,88,90,11,27};
        int max_array=give_me_max(array);
        int min_array=give_me_min(array);
        System.out.println("Max output "+max_array);
        System.out.println("Min_Output "+min_array);

    }

    static int give_me_max(int[] array){
        int max = array[0];
        for(int i=0; i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
    static int give_me_min(int[] array){
        int min=array[0];
        for (int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
}
