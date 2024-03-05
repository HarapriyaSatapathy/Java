package src.Loops.ForLoop;

public class Lab004 {
    public static void main(String[] args) {
        final boolean b=true;
        // b=false;
        for (;b;){
            System.out.println("Rinky");
        }
    }
}
//IQ:  In this case ,o/p will be printed beacuse we have declared teh final keyword for
//boolean b variable. so the value will never be changed and if teh condition is true , sop will
//print teh value but it will be infinite loop as we dont have intiallization