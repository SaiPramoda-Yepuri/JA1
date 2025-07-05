package ex_18_OOPS_Constructor;

public class Constructor_this {
    public static void main(String[] args) {
        BabyA b1 = new BabyA();
        BabyA b2 = new BabyA();
        System.out.println(b1.name);
        System.out.println(b2.name);


        BabyA b3  = new BabyA("Honey","23454323",2025,07,01);
        BabyA b4  = new BabyA("Naini","13454323",2024,07,01);
        System.out.println(b3.name);
        System.out.println(b4.name);

    }
}
class BabyA{

    String name;
    String aadhar_number;
    int year;
    int month;
    int day;

    // DC
    BabyA(){
        name = "Honey";
        aadhar_number = "0000";
        year = 2018;
        month = 10;
        day = 02;

    }

    BabyA(String name_user,String aadhar_number_user,int year_user, int month_user,int day_user){
        this.name = name_user;
        this.aadhar_number = aadhar_number_user;
        this.year = year_user;
        this.month = month_user;
        this.day = day_user;
    }



}