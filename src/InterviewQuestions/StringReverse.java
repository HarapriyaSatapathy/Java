package src.InterviewQuestions;

public class StringReverse {
    public static void main(String[] args) {
        String s1="Hello";
        String y="";
        for(int i=s1.length()-1;i>=0;i--){
            y=y+s1.charAt(i);

        }
        System.out.println(y);
    }

}
