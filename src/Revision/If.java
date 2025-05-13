package src.Revision;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();


        if (num == 20) {
            System.out.println("Number is within range");
        } else if (num < 20) {
            System.out.println("Number is less than range");

        } else {
            System.out.println("Number is greater than range");

        }
    }
}
