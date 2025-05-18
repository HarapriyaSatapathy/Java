package src.InterviewQuestions;

public class ReverseInt {
    public static void main(String[] args) {
        long num=12345;
        long rev=0;

        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println(rev);

    }
}
