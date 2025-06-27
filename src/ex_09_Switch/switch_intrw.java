package ex_09_Switch;

public class switch_intrw {
    public static void main(String[] args) {
        int a = 10;
        switch (a) {
        }

        char c = 'B';
        switch (c) {
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("Print 98");

        }
    }
}
