package src.Basics02;

import java.util.Scanner;

public class Lab004_UserInputInArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the Size of the array");
        int n= sc.nextInt();
         int arr[]= new int [n];
        System.out.println("Enter the elements");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Output is");
        for(int i=0; i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
