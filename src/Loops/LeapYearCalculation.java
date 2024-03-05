package src.Loops;

import java.util.Scanner;

public class LeapYearCalculation {
    public static void main(String[] args) {
        //WOP to find out the Year is a Leap year or not
        //Leap year is divisible by 4
        //but not by 100 unless it is also divisible by 400

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Year");
        int year=sc.nextInt();

        if ((year%4==0) && (year%100 !=0 || year%400==0))
        {
            System.out.println("Its a Leap year");
        }
        else{
            System.out.println("Its not a leap year");
        }
    }
}
//(year%4==0)--year divisible by 4
//and-->&&
//(year%100 !=0 || year%400==0)--year not divisible by 100 , but must be divisible by 400
//so the year (divisible by 4) and (not divisible by 100 or divisible by 400)
