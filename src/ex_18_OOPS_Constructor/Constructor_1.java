package ex_18_OOPS_Constructor;

public class Constructor_1 {
    public static void main(String[] args) {
        Baby b = new Baby();

    }
}
class Baby{
    String name;
    Baby(){
        System.out.println("I'm  Default constructor");
        System.out.println("Adhaar number is ready");
    }
    void m1(){
        System.out.println("Im m1");
    }
    void cry(){
        System.out.println("Cry");
    }
    void sleep(){
        System.out.println("Sleep");
    }
    void eat(){
        System.out.println("Eat");
    }
}
