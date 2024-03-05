package src.Loops.ForLoop;

public class Lab009 {
    public static void main(String[] args) {
        // b=false;
        for(int i=0; i<10; ++i){
            System.out.println(i);

        }
        System.out.println("--End of the program--");
    }
}
//IQ: Here we are doing preincreament but still the o/p will be 1-10
//because in for loop, updation occurs after the body execution
//The flow is -->initiallization-->condition(if true)-->execution-->updation
//int i=0--->i<10-->print i-->++i/i++/i--/--i