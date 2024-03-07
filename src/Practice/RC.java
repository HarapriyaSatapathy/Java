package src.Practice;

import java.util.Scanner;

public class RC {
    public static void main(String[] args) {

//        Lab019 p1=new Lab019();
//        p1.name="hi";
//        p1.Printdetails();

      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your name");
      String name1=sc.next();
        System.out.println("Enter your age");
        int age1=sc.nextInt();
        System.out.println("Enter your marrital status");
        boolean ismarried1=sc.nextBoolean();
        System.out.println("Enter your colur");
        String colour1=sc.next();

        Lab019 p2=new Lab019(name1,age1,ismarried1,colour1);
        p2.Printdetails();

    }
}
