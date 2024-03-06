package src.Practice;

public class Lab005 {
    public static void main(String[] args) {
        //use of multiple methods in single class

        int s = sum(3, 4);//will call the method from line 16 as we have 2 arguments with int here,
        // and matching with line 10 method arguments
        System.out.println(s);

        double s1 = sum(5.3, 6.2);//will call the method from line 21 as we have 2 arguments with double
        // here,and matching with line 16 method arguments
        System.out.println(s1);
    }

    static int sum(int a,int b)
    {
        return a+b;
    }
   // static int sum(int a, int b)//In this case, its not possible to have same method with same paramenters
     static double sum(double a,double b)//we should at least change teh data type and return type
    {
        return a+b;
    }

}
//This concept is called method overloading
//When we have same method name but parameters differs