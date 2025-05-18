package src.InterviewQuestions;

import javax.print.DocFlavor;
import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String s1="I am good";
        String y[]=s1.split(" ");

       for(int i=y.length-1;i>=0;i--){
           String z=y[i];
           System.out.println(z);

       }





    }
}
