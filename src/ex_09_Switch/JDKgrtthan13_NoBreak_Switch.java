package ex_09_Switch;

public class JDKgrtthan13_NoBreak_Switch {
    public static void main(String[] args) {
        int itemcode =002;
        switch(itemcode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");
        }
    }
}
