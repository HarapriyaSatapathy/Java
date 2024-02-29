package src.Operators;

import src.InheritanceMultilevel.Father;

public class Logical {
    public static void main(String[] args) {
        // !---NOT
        //&&---AND
        // ||--OR

        int a=10;
        int b=30;
        System.out.println(a=b);
        System.out.println(!(a>b));

//        && operator  A.B
//        T $$ T =T
//        T $$ F =F
//        F $$ T =F
//        F $$ F =F

//        || operator  A+B
////        T $$ T =T
////        T $$ F =T
////        F $$ T =T
////        F $$ F =F

        boolean r1= (b>12 || a<100);
        System.out.println(r1);
        boolean r2= (b>500 || a<100);
        System.out.println(r2);
        boolean r3= (!(b>500 || a<100));
        System.out.println(r3);
        boolean r4= (b>500 && a<100);
        System.out.println(r4);
        boolean r5= (!(b>500 && a<100));
        System.out.println(r5);

    }
}
