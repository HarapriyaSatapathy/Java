package src.InterviewQuestions;

public class OccuranceOfOneChar {
    public static void main(String[] args) {
        String s1="Java is a programming language";

        int l1=s1.length();
        int l2=s1.replace("a","").length();

        int ocuurance=l1-l2;

        System.out.println(ocuurance);
    }
}
