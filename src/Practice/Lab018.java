package src.Practice;

import java.util.Scanner;

public class Lab018 {
    public static void main(String[] args) {
        //paliindrom program---mom

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word");
        String w = sc.next();
        char[] char_word = w.toCharArray();// {m,o,m}

        String y = "";

        for (int i = w.length() - 1; i >= 0; i--) {
            y = y + w.charAt(i);

        }
//        System.out.println(y);
            String rev = new String(char_word);

//        System.out.println(rev);
            if (rev.equalsIgnoreCase(y)) {
                System.out.println("Its a pallindrome");
            } else {
                System.out.println("Not a pallindrome");

            }

        }


    }


