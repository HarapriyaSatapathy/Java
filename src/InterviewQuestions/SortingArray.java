package src.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingArray {
    //Print all the 0s in lest side and all 1s in right side
    public static void main(String[] args) {

        int arr[]={0,0,1,0,1,0};
        List<Integer> list=new ArrayList<>();

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            list.add(arr[i]);

        }
        System.out.println(list);
    }
}
