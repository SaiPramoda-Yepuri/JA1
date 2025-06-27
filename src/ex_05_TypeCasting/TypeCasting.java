package ex_05_TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        float total = (float)course+GST; // explicit casting
        float total2 = course+GST; //implicit
        System.out.println(total);
        long ph = 98756565761l;
        //short s = ph;
        System.out.println(ph);
        //System.out.println(s);

    }
}
