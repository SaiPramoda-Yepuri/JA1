package ex_16_Arrays;

public class Array_multidimension_loop {
    public static void main(String[] args) {
        int[][] matrix = {{2,3,4},{5,6,7},{1,4,7}};
        System.out.println(matrix.length);

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
