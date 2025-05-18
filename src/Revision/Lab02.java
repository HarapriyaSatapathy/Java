package src.Revision;

import java.util.Scanner;

public class Lab02 {
    //take user input for an array and print teh values

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();

        int array[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Elements of the array----");
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
        sc.close();
    }
}
