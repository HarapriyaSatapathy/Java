package src.ExceptionHandling;

import java.io.File;
import java.io.FileReader;

public class Lab005 {
    public static void main(String[] args) throws Exception {
        //Instaed of adding throw or try catch block for each failed condition, added throes at the method signature

        String path = "C://a.txt";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);//checked exception



    }
    public static void Func1(){
        int a=0;
        int x=10/a;//unchecked exception
        if(x>10){
            throw new ArithmeticException();


            }

        }

        }


