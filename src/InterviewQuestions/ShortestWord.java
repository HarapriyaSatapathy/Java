package src.InterviewQuestions;

public class ShortestWord {
    //Find teh shortest word in the String
    public static void main(String[] args) {
        String s1="Welcome to the Interview";
        String s2[]=s1.split(" ");
        String shortword=s2[0];
        for(String word:s2){
            if(word.length()<shortword.length()){
                shortword=word;
            }
        }
        System.out.println(shortword);
    }
}
