package src.Loops.WhileLoop;

public class Lab001 {
    public static void main(String[] args) {
        int i=0;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        System.out.println(i);
    }
}
//The execution for both for loop and while loop is similar but with below diff:
//In for loop , we initialize the value within the loop whereas in while loop,
//initialization done outside.
//And the benifit is we can use the variable outside of the loop in case of while
//but in for loop we can not
