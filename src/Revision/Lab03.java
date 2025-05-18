package src.Revision;

import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int length=sc.nextInt();
        System.out.println("Enter the names");
        String name[]=new String[length];
        for(int i=0;i<length;i++){
            name[i]=sc.next();
        }
        System.out.println("My frineds name are---");
        for(int i=0;i<length;i++){
            System.out.println(name[i]);
        }
    }
}
