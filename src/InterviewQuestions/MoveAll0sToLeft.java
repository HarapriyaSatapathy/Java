package src.InterviewQuestions;

public class MoveAll0sToLeft {
    public static void main(String[] args) {
        int arr[]={0,9,0,3,2,0,0,5,0,7};
        //o/p={0,0,0,0,0,9,3,2,5,7}

        int n=arr.length;
        int result[]=new int[n];
        int j=0;

        for(int i=0;i<n;i++){
            if(arr[i]==0){
                result[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                result[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }
    }
}
