package src.Basics01;

public class Lab005_Concatenation {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        String name="Rinky";
        System.out.println(a+b+name);
        //Execution happens from left to right, so in this case 1st 2 int values
        //addition will be happening and then int+string= string
        //so it will be 5+10+name=15Rinky
    }
}
