package src.Loops.ForLoop;

public class Lab007 {
    public static void main(String[] args) {
        // b=false;
        for(int i=0; i<=10; i++){
            System.out.println(i);
            if (i==5){
                break;
            }

        }
        System.out.println("--End of the program--");
    }
}
//In this case we are 1st printing the value of i then putting the break condition
//that the loop should stop at 5. So 1-5 will be printed and then the loop will
//be stopped and come out to print the end program