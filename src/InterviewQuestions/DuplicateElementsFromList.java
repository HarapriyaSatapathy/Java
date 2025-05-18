package src.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DuplicateElementsFromList {
    public static void main(String[] args) {
        ArrayList<String> arr= new ArrayList<>(Arrays.asList("Ram","Rahul","Rahul","Ram","Rohan"));

        HashSet<String> checkset=new HashSet();
        HashSet<String>target=new HashSet();

        for(String str:arr){
            if(!checkset.add(str)){
                target.add(str);
            }
        }
        System.out.println(target);

    }

}
