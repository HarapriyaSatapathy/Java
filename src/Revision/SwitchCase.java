package src.Revision;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the browser name");
        String browser=sc.next();

        switch(browser){
            case "chrome" :
                System.out.println("Execute chrome code");
                break;
            case "firefox" :
                System.out.println("Execute firefox code");
                break;
            default:
                System.out.println("Not sure");


            }
        System.out.println("--End of the program--");
        }

    }

