package src.Loops.ForLoop;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter which table");
        int table=sc.nextInt();

        for (int i=1;i<=10;i++)
        {
            System.out.println(table*i);

            }
        }
    }

