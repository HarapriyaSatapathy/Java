package src.Conditions;

import java.util.Scanner;

public class Powersolving {
    public static void main(String[] args) {
        // (x^2+Y^-|Z|)^1/3

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of X");
        double X= sc.nextDouble();
        System.out.println("Enter value of Y");
        double Y= sc.nextDouble();
        System.out.println("Enter value of Z");
        double Z= sc.nextDouble();

        double Result= 0;
//        double a= Math.pow(X,2);
//        double b=Math.pow(Y,2);
//        double c= Math.abs(Z);
//        Result= Math.cbrt((a+b-c));
//        System.out.println(Result);

        Result=Math.cbrt((Math.pow(X,2)) + (Math.pow(Y,2))- Math.abs(Z));
        System.out.println(Result);

        sc.close();

    }

}
