package src.Operators;

public class Concatenation {
    public static void main(String[] args) {
        //Concatenation operator is only used when we have String or String +other data type

        String str1="Rinky";
        String str2="Chintu";
        int a=10;
        int b=20;
        System.out.println(str1+str2);
        System.out.println(str1+a+b);//execution always starts from right to left
        System.out.println(a+b+str2);
    }
}
