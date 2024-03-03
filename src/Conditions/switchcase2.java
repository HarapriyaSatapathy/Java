package src.Conditions;

import java.util.Scanner;

public class switchcase2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the browser name");
        String browser=sc.next();

        switch(browser){
            case "chrome":
                System.out.println("Execute chrome browser code only");
                break;
            case "edge":
                System.out.println("Execute edge browser code only");
                break;
            case "firefox":
                System.out.println("Execute firefox browser code only");
                break;
            case "opera":
                System.out.println("Execute opera browser code only");
                break;
            default:
                System.out.println("No browser code run");
        }
    }
}
