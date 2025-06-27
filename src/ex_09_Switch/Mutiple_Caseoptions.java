package ex_09_Switch;

public class Mutiple_Caseoptions {
    public static void main(String[] args) {
        int itemcode = 006;
        switch (itemcode){
            case 001,002,005:
                System.out.println("All are electronic gadgets");
                break;
            case 004,006,007:
                System.out.println("Mech gadget");
                break;
            default:
                System.out.println("None");
        }
    }
}
