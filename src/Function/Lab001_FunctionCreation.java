package src.Function;

public class Lab001_FunctionCreation {
    public static void main(String[] args) {

    int a= sum(3,4);
        System.out.println(a);
    }
//Create a function syntax= access Modifier returntype methodname (parameterlist){
//Method body                    }
    public static int sum(int input1,int input2){
        return input1+input2;
    }

}
