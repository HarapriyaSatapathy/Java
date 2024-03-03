package src.Operators;

public class IncrementDecrement4 {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a++ + ++a + a++);
        System.out.println(a);
        //Devide the equation
        // a++----> Exp:10   a:11   O/p:10
        // ++a----> Exp:12   a:12   O/p:12
        // a++----> Exp:12   a:13   O/p:12
        //a++ + ++a + a++=10+12+12=34
        //a=13

    }
}
