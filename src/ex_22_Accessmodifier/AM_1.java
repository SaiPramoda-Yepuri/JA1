package ex_22_Accessmodifier;

public class AM_1 {

}
class Father{
    private int gold = 10;
    int car = 1;
    public int bhk3 = 1;
}

class Son extends Father{
    void weCanuse(){
//        System.out.println(gold);
        System.out.println(car);
        System.out.println(bhk3);
    }
}
