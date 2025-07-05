package ex_17_OOPS;

public class Object_instance {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2;
        new Student();
    }
}
    class Student{
        String name;

        // is called as the default constructor, same name as the class name.
        Student(){
            System.out.println("DC");
        }
        void sleep(){
            System.out.println("Hi");
        }

    }



