package src.Practice;

public class Methodoverloading {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        int result=Sum(1,2);
        System.out.println(result);
        double result1=Sum(1.1,1.1);
        System.out.println(result1);
        String result2=Sum("a","b");
        System.out.println(result2);

    }

    static int Sum(int a, int b) {
        return a + b;
    }

    static double Sum(double c, double d) {
        return c + d;
    }

    static String Sum(String e, String f){
        return e+f;

    }
}//same method name but diffrent arguments and data type..JVM knows it during compile time

