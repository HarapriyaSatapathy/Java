package src.String;

public class StringBuilderAppend {
    public static void main(String[] args) {
        StringBuilder sb1= new StringBuilder("Rinky");
        System.out.println(sb1.append(" "+ "satapathy"));
        System.out.println(sb1);

    }
}
//StringBuilder are mutable in nature, so that the string value can be changed.
//concat function is not there in StringBuilder, append is the function for adding