package src.Practice;

import java.util.Scanner;

public class Lab013 {
    //Reverse a string
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String name=sc.next();

        char[]name_arr=name.toCharArray();

        int left=0;
        int right=name_arr.length-1;

        while(left<right){

            char temp=name_arr[left];
            name_arr[left]=name_arr[right];
            name_arr[right]=temp;

            left++;
            right--;

        }
        System.out.println(name_arr);

    }
}
