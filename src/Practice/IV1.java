package src.Practice;

public class IV1 {
    //Print only those numbers which are divisible by 10 between 1-1000
    public static void main(String[] args) {

        for(int i=1;i<=1000;i++)
        {
            if (i%10==0){
                System.out.println(i+"--->This number is divisible by 10");
            }

        }

    }

}
