package src.Array;

import java.util.Scanner;

public class Lab005_UserMarksInputArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter teh size of array");
        int n=sc.nextInt();
        int marks[]=new int[n];

        System.out.println("Enter the Marks");
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        System.out.println("The marks are -->");
        for(int i=0;i<n;i++){
            System.out.println(marks[i]);
        }
    }
}
