package ex_17_OOPS;

public class OOPS2 {
    OOPS2(){
        System.out.println("Main class");
    }
    public static void main(String[] args) {
Cat c1= new Cat();
c1.running();
new Cat().running();

    }
}
class Cat{
    void running(){
        System.out.println("Running");
    }
}
