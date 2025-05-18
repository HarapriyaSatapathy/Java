package src.InterviewQuestions;

public class PrintnextletterInWord {
    //I/p-"HARAPRIYA" . O/P---"IBSBRSJZB (Next letter of each char)
    public static void main(String[] args) {

        String str1="HARAPRIYA";

        char ch[]=str1.toCharArray();
        String str2=" ";

        for(int i=0;i<ch.length;i++){

            char c=(char)(ch[i]+1);
            str2=str2+c;
        }
        System.out.println(str2);


    }
}
