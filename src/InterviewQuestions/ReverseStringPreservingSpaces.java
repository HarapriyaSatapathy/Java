package src.InterviewQuestions;


public class ReverseStringPreservingSpaces {
    public static void main(String[] args) {
        String str="I am from California";
        char arr[]=str.toCharArray();
        char result[]=new char[arr.length];

        for(int i=0;i<arr.length;i++){
            if(arr[i]==' '){
                result[i]=' ';
            }
        }
        int j=result.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=' '){
                if(arr[j]==' '){
                    j--;

                }
                result[j]=arr[i];
                j--;
            }
        }
        System.out.println(String.valueOf(result));
    }
}