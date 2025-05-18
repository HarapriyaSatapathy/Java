package src.Revision;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name");
        String name=sc.next();

        String y="";
        for(int i=name.length()-1;i>=0;i--){
            y=y+name.charAt(i);
        }
//        System.out.println(y);
        if(y.equalsIgnoreCase(name)){
            System.out.println("Name is pallindrom");

        }
        else{
            System.out.println("Name is not pallindrom");
        }
    }
}
