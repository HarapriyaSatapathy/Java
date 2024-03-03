package src.Operators;

public class IncrementDecrement6 {
    public static void main(String[] args) {
        int a=5;
        System.out.println(a-- + a++ + --a + a--);
        System.out.println(a);
        //Devide the equation
        // a-- ----> Exp:5   a:4   O/p:5
        // a++ ----> Exp:4   a:5   O/p:4
        // --a ----> Exp:4   a:4   O/p:4
        //a-- ----->Exp: 4    a:3    o/p:4
        // a-- + a++ + a++ + a-- = 5+4+4+4= 17
        //a=3

    }
}
