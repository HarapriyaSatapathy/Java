package src.Operators;

public class ternaryOperator {
    public static void main(String[] args) {

        int a=true ? 10:20; //if condition true then print the 1st value and if false then 2nd value
        System.out.println(a);
        String str= 10>30 ? "10":"TWENTY";
        System.out.println(str);

        int num1=50;
        int num2=60;
        int num3=40;
        int max=(num2>num1) ? num2:num1;
        int min=(num1<num2) ? num1:num2;
        int max1=(num1>num2) ? ((num1>num3) ?num1:num3) : ((num2>num3) ?num2:num3);//between 3 nums
        System.out.println(max);
        System.out.println(min);
        System.out.println(max1);


    }
}
