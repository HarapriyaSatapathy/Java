package src.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class EvenOddSeparate {
    public static void main(String[] args) {
        int arr[]={71,21,67,18,42,32,14};

       // int even[]=new int[arr.length];
        //int odd[]=new int[arr.length];
        List<Integer> evenlist=new ArrayList<>();
        List<Integer> oddlist=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenlist.add(arr[i]);

            }
            if(arr[i]%2!=0){
                oddlist.add(arr[i]);

            }



        }
        System.out.println("even numebrs list---"+evenlist);
        System.out.println("odd numebrs list---"+oddlist);









    }

}
