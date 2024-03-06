package src.Practice;

import java.util.Scanner;

public class Lab015 {
    //alternate way to reverse a string
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=sc.next();


        String y="";
        for(int i=name.length()-1;i>=0;i--){
            y=y+name.charAt(i);
        }
        System.out.println(y);

    }



}
