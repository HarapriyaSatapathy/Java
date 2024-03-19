package src.Practice;

import java.util.Scanner;

public class Lab22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String Word=sc.next();
        char char_arr[]=Word.toCharArray();

        String y="";

        for (int i= char_arr.length-1;i>=0;i--){

            y=y+char_arr[i];
        }
        System.out.println(y);//will reverse the string
       String rev=new String(char_arr);//will reverse to string
       if (y.equalsIgnoreCase(rev)){
           System.out.println("Its a Pallendrom");
       }
       else{
           System.out.println("Not a pallindrom");//if condition checks for pallindrom
       }

        }
    }

