package src.InterviewQuestions;

public class WordsReverseInSTring {
    public static void main(String[] args) {

        String str1="I am from carlifornia";
        String str2[]=str1.split(" ");
        String rev_str="";

        for(int i=0;i<str2.length;i++){
            String word=str2[i];
            String rev_word="";
            for(int j=word.length()-1;j>=0;j--){
                rev_word=rev_word+word.charAt(j);
            }
            rev_str=rev_str+rev_word+" ";
        }
        System.out.println(rev_str);

    }
}
