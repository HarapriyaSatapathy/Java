package src.InterviewQuestions;

public class MaxNumInArray {
    public static void main(String[] args) {
        int arr[]={30,90,56,10};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }
        System.out.println(max);


            }
        }


