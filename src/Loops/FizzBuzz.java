package src.Loops;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        //WOP that prints number from 1-20
        //For multiples of 3, print Fizz
        //For multiples of 5, print Buzz
        //for both mutiples of 3 & 5, print FizzBuzz
        //when we have condition like above, the 1st condition we should write for both
        //as per teh BODMAS rule
        Scanner sc=new Scanner(System.in);
        System.out.println("FizzBuzz from 1 to which number?");
        int num=sc.nextInt();

        for (int i=1;i<=num;i++){
            if(i%3==0 && i%5==0){
                System.out.println(i+" "+ "FizBuzz");
            }
           else if (i%3==0){
                System.out.println(i+" "+"Fizz");

            }
            else if(i%5==0){
                System.out.println(i+" "+"Buzz");
            }

        }

        }
    }

