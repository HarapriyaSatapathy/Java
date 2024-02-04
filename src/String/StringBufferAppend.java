package src.String;

public class StringBufferAppend {
    public static void main(String[] args) {
        StringBuffer sb1= new StringBuffer("Rinky");
        System.out.println(sb1.append(" "+ "satapathy"));
        System.out.println(sb1);

    }
}
//StringBuffer are mutable in nature, so that the string value can be changed.
//concat function is not there in StringBuffer, append is the function for adding