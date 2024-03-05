package src.Conditions;

import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        //condition for vowel---the word starts with a,e,i,o,u

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        char word=sc.next().toCharArray()[0];
        System.out.println(word);
        //sc.next() expects a string, so toCharArray()[0] will convert to char and
        // take the 0th index of the word


        switch(word){
            case 'a':
                System.out.println("Its a vowel");
                break;
            case 'e':
                System.out.println("Its a vowel");
                break;
            case 'i':
                System.out.println("Its a vowel");
                break;
            case 'o':
                System.out.println("Its a vowel");
                break;
            case 'u':
                System.out.println("Its a vowel");
                break;
            default:
                System.out.println("Its a consonant");

        }
    }
}
