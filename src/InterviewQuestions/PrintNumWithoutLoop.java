package src.InterviewQuestions;

public class PrintNumWithoutLoop {
    public static void main(String[] args) {

        PrintNum(1);


    }

    public static void PrintNum(int n){
        if(n<=100){
            System.out.println(n);
            n++;
            PrintNum(n);
        }


    }
}
