package src.Loops.ForLoop;

public class Lab006 {
    public static void main(String[] args) {
        // b=false;
        for(int i=0; i<=10; i++){
            if (i==5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("--End of the program--");
    }
}
//Break is used to stop the loop at specific time which is nothing but a condition
//in this case when i==5, the loop should stop. so it will print i= 1-4