package src.ExceptionHandling;

import java.io.File;
import java.io.FileReader;

public class Lab004 {
    public static void main(String[] args) {

        try{
            String path="C://a.txt";
            File file=new File(path);
            FileReader fileReader=new FileReader(file);//this is a checked exception, which JVM knowns already
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Error");
        }
        finally {
            System.out.println("End of the programme");
        }

    }
}
