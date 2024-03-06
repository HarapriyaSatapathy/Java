package src.Basics01;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        //from 1-50
        //multiples of 3-->Fizz
        //Multiple of 5-->Buzz
        //Both--> FizzBuzz

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int range=sc.nextInt();
        for(int i=1;i<=range;i++){
            if(i%2==0 && i%5==0) {
                System.out.println(i + " " + "FizzBuzz");
            }
                else if (i%2==0){
                    System.out.println(i+ " "+ "Fizz");
                }
            else if(i%5==0){
                System.out.println(i+ " "+"Buzz");
            }

            }
        }
    }

