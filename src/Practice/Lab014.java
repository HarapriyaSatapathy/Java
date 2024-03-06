package src.Practice;

import java.util.Scanner;

public class Lab014 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String name=sc.next();

        char[]name_arr=name.toCharArray();

        int left=0;
        int right=name_arr.length-1;

        for(left=0;left<right;){
            char temp;
            temp=name_arr[left];
            name_arr[left]=name_arr[right];
            name_arr[right]=temp;

            left++;
            right--;

        }
        System.out.println(name_arr);
    }
}
