package src.InterviewQuestions;

public class MinNumInArray {
    public static void main(String[] args) {
        int arr[]={12,10,98,54,78};
        int min=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
