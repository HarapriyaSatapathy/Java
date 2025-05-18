package src.Practice;

public class PrintNumWithoutNumber {
    public static void main(String[] args) {
        //Print 1-100 without using any numeric value

        int one='A'/'A';// Which is equals to 1
        String s1="..........";//10 dots
        for (int i=one;i<=(s1.length()*s1.length());i++)
        {
            System.out.println(i);
        }
    }
}
