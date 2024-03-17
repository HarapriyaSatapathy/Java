package src.Practice;

import java.util.Arrays;

public class IV2 {
    public static void main(String[] args) {
        String a = "rinky";
        String b = "kyinr";

        char char_arr[] = a.toCharArray();
        char char_arr2[] = b.toCharArray();

        Arrays.sort(char_arr);
        Arrays.sort(char_arr2);

        if(a.length()!=b.length()){

        } else if (Arrays.equals(char_arr,char_arr2)==true){
            System.out.println("Its an anagram");
        }
        else{
            System.out.println("Its not an anagram");
        }

    }

    }

