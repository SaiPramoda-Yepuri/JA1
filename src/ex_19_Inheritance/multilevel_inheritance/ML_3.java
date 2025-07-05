package ex_19_Inheritance.multilevel_inheritance;

public class ML_3 {
    public static void main(String[] args) {


        // Son s1 = new Father();
        //  Son s1 = new GrandFather();
        Son john = new Son();
        System.out.println(john.gold_gf);
        john.gf();

        GrandFather grandFather = new Son();
        grandFather.home();
    }
}
