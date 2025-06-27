package ex_09_Switch;

import java.util.Locale;
import java.util.Scanner;

public class switch_Auomation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the browser which you want to start");
        String browser = s.next();
        browser = browser.toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Starting chrome");
                break;
            case "edge":
                System.out.println("Starting edge");
            default:
                System.out.println("Sorry i dont know this browser");
                break;
        }
    }
}
