package src.Practice;

import java.util.Arrays;

public class Lab23 {
    public static void main(String[] args) {
        String s1="Keep";
        String s2="peek";

        char c1[]=s1.toLowerCase().toCharArray();
        char c2[]=s2.toLowerCase().toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        boolean status= Arrays.equals(c1,c2);

        if(s1.length()!=s2.length()){
            System.out.println("not ana");
        }
        if(status){
            System.out.println("annagram");
        }
        else{
            System.out.println("not annagram");

        }

    }
}
