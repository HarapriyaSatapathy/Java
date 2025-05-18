package src.InterviewQuestions;

public class IQ2 {
    public static void main(String[] args) {
        String str1="I am from California";
        String y="";

        for(int i=str1.length()-1;i>=0;i--){
            if(str1.charAt(i)==' '){
                y=y;

            }
            else{
               y=y+str1.charAt(i);
            }

        }
        System.out.println(y);
    }

}
