package src.Practice;

public class ClassInterfaceRC implements Interface{

    public static void main(String[] args) {
        System.out.println(Interface.a);

        Interface.print2();
//        Interface.print();//can not use default method as its not static
//
//        Class c1=new Class();
//        System.out.println(c1.a);

    }


}
