package src.oops;

public class ObjectCreation2 {
    public static void main(String[] args) {
        Person p2=new Person();
        System.out.println(p2.ref_name);
        //In this case we have assigned teh parameter name with a value
        //so when we called the Person class with p2 refernece variable, it printed the same name
        //But the diadvantage is while creating a new person (Ex-p3), the name will
        //also be same as we have hard coded in class
        //to overcome this there is a method called Constructor
    }
}
