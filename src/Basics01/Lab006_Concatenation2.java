package src.Basics01;

public class Lab006_Concatenation2 {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        String name="Rinky";
        System.out.println(name+a+b);
        //Execution happens from left to right, so in this case 1st string+int=string
         //and then string + one more int=string
        //so it will be name+5+10=Rinky510
    }
}
