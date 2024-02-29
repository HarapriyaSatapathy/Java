package src.Operators;

public class Relational {
    public static void main(String[] args) {
        int a_age=40;
        int b_age=60;
        System.out.println(a_age>b_age);
        System.out.println(b_age>a_age);

        int c=10;
        int d=20;
        int b=65;
        System.out.println(c==d);
        System.out.println('A'==65);//char value inside sout is always integer and the ASCII value
                                    //of char is 65
        System.out.println('A'==65.0);//decimal with 65.0 is considered as 65 inside sout
        System.out.println('A'==b);
        System.out.println('A'==65.2);//proper decimal, so it will be false
    }
}
