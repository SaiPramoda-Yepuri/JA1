package ex_09_Switch;

public class Switch_value_without_initialz
{
    public static void main(String[] args) {
        int a = 11;
        char code = 'C';
        switch (-1){
            default -> System.out.println("Default");
            case -1 -> System.out.println("10");
            case 9 -> System.out.println("9");
        }
        switch (code){
            default -> System.out.println("Hello");
            case 'A' -> System.out.println("65");
            case 'B' -> System.out.println("66");
        }
    }
}
