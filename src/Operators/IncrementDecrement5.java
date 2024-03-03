package src.Operators;

public class IncrementDecrement5 {
    public static void main(String[] args) {
        int a=10;
        System.out.println(--a + a-- + a--);
        System.out.println(a);
        //Devide the equation
        // --a----> Exp:9   a:9   O/p:9
        // a-- ----> Exp:9   a:8   O/p:9
        // a-- ----> Exp:8   a:7   O/p:8
        //--a + a-- + a--=9+9+8=26
        //a=7

    }
}
