package src.Practice;

public class Lab004 {
    public static void main(String[] args) {
        //use of multiple methods in single class

        int s = sum(3, 4);//will call the method from line 10 as we have 2 arguments here,
        // and matching with line 10 method arguments
        System.out.println(s);

        int s1 = sum(5, 6, 7);//will call the method from line 16 as we have 3 arguments here,
        // and matching with line 16 method arguments
        System.out.println(s1);
    }

    static int sum(int a,int b)
    {
        return a+b;
    }
    static int sum(int a, int b, int c)
    {
        return a+b+c;
    }

}
//This concept is called method overloading
//When we have same method name but parameters differs