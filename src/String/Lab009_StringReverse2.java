package src.Basics02;


public class Lab009_StringReverse2 {
    public static void main(String[] args) {
        String name = "RINKY";
        String y="";

        for (int i=name.length()-1;i>=0;i--)
        {
            y= y+ name.charAt(i);

        }
        System.out.println(y);

    }
}
