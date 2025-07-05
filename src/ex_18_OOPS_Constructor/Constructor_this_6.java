package ex_18_OOPS_Constructor;

public class Constructor_this_6 {
    public static void main(String[] args) {
        Person p1 = new Person("PRAMODA",897654,"abc");
        System.out.println(p1.name);
        Person p2 = new Person("YS",876555,"XYZ");

    }
}
class Person {

    String name;
    long phone;
    String address;

    Person(){

    }
    Person(String name_user){
        this.name = name_user;
    }

    Person(String name_user,long phone_user,String address_user){
        this.name = name_user;
        this.address = address_user;
        this.phone = phone_user;

    }
    Person(String name_user,long phone_user){
        this.name = name_user;
        this.phone = phone_user;

    }




}
