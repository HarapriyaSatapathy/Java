package src.Conditions;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        //Which day it is??
        //monday-1,Tuesday-2.....Sunday-7

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day");
        int daynum=sc.nextInt();

        switch(daynum){                         //1 expression
            case 1:
                System.out.println("Its Monday");//multiple conditions
                break;
            case 2:
                System.out.println("Its Tue");
                break;
            case 3:
                System.out.println("Its Wed");
                break;
            case 4:
                System.out.println("Its Thur");
                break;
            case 5:
                System.out.println("Its Fri");
                break;
            case 6:
                System.out.println("Its sat");
                break;
            case 7:
                System.out.println("Its Sun");
                break;
            default:
                System.out.println("Are you mad?");//this break is optional if default is the last option
        }
        System.out.println("--End of the Program--");
    }
}
