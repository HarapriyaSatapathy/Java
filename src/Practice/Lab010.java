package src.Practice;

import java.util.Scanner;

public class Lab010 {
    public static void main(String[] args) {
        //take user input for array

        Scanner sc=new Scanner(System.in);
        System.out.println("Array size");
        int s=sc.nextInt();
        int arr[]=new int[s];
        System.out.println("Enter the elements");

       for(int i=0;i<s;i++){
           arr[i]=sc.nextInt();
        }
       for (int i=0;i<s;i++){
           System.out.println(arr[i]);
       }

     sc.close();




    }
}
