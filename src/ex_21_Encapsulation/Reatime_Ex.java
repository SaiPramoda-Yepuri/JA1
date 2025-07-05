package ex_21_Encapsulation;

public class Reatime_Ex {
    public static void main(String[] args) {
        ICICIBank ib = new ICICIBank("YSP",100);
        long bal = ib.getBal();
        System.out.println(bal);
        ib.setBal(500, true);
        long bal2 = ib.getBal();
        System.out.println(bal2);
    }
}


class ICICIBank {

    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.

    private String name;
    private long bal;


    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if (isCashier) {
            this.bal = bal;
        } else {
            System.out.println("Not allowed to change the Bal");
        }
    }
}
