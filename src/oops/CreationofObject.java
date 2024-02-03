package src.oops;

public class CreationofObject {
    public static void main(String[] args) {
        Person p1=new Person();
        System.out.println(p1.ref_name);
        //In this program the name will be null beacuse we have not assigned
        //the name value, and so the default value of string will be null
        //its happening beacuse of default constructor

    }
}
