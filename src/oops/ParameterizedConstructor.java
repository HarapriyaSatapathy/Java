package src.oops;

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Person p2=new Person("Rinky",30);
        p2.PrintDetails();

        Person p1=new Person();
        p1.PrintDetails();
    }
}
