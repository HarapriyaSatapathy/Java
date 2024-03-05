package src.Loops.ForLoop;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        //Condition for prime number
        //1. it should only be divisible by 1 and itself
        //2.it should not be divisible by any other number
        // EX--9
        // 0,1,2,3,4,5,6,7,8,9---->here 9 is divisible by 1 & 9 but we need to also check
        //whether its divisible by 2,3,4,5,6,7 and 8-->it should not be. 9/3=0 so its not prime
        //EX:5 ---0,1,2,3,4,5--->divisible by 1 &5 and not divisible by 2,3,4--so its prime

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        boolean Prime=true;

        for (int i=2;i<num;i++){
            if (num%i==0)
            {
                Prime=false;
                break;
            }

            }
        System.out.println(Prime);

        }

    }

