package src.TypeCasting;

public class ImplicitTypeCasting {
    public static void main(String[] args) {
        //When typecasting is done by JVM automatically, its called Implicit TC
        //When Typecasting done by the programmer, its called Explicit TC
        //There are 2 type of TC--Widening and Narrowing

        //Widening---Lower to Higher
        byte a=10;
       // int b=a;//Valid--Automatically done by JVM--Implicit TC
       int b=(int)a;//Valid---Programmer specify---Explicit TC
        System.out.println(b);

        //Narrowing---Higher to Lower
        int c=300;
        //byte d=c;//inValid--Automatically done by JVM--Implicit TC
        byte d=(byte)c;//Valid---Programmer specify---Explicit TC
        System.out.println(d);


    }
}
