package src.InterviewQuestions;

public class WordsInString {
    public static void main(String[] args) {
        String s1="Welcome to my home";
        int count =1;

        for(int i=0;i<s1.length()-1;i++){

            if((s1.charAt(i)==' ')&& (s1.charAt(i+1) !=' '))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
