package ex_19_Inheritance.hierarchial;

public class Hierarchial_Inh {
    public static void main(String[] args) {
Father f1 = new Father();
HN hn = new HN();
hn.home();
f1.home();

YS y = new YS();
y.home();

Pramoda p = new Pramoda();
p.me();
p.home();
    }
}
class Father{
    void home(){
        System.out.println("3BHK");
    }
}

class YS extends Father{
    void h2(){
        System.out.println("h2 - Pramoda");
    }
}

class Pramoda extends Father{

    void me(){
        System.out.println("Pramoda");
    }
}

class HN extends Father {
    void hn(){
        System.out.println("HN");
    }
}
