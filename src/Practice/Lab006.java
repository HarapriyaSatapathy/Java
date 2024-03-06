package src.Practice;

public class Lab006 {
    public static void main(String[] args) {

        //Can we have 2 main method in a class
        //ans is yes but only if its has different signature, refer below

        //  public static void main(String[] args){//Here signature is same as main method, so it will not work


        main();

    }
    public static void main(int a, int b)//Its possible as we have changed the parameters
    {

    }
    public static void main(){
        System.out.println("hello world");
    }
}
