package src.String;

public class StringequalIgnorecase {
    public static void main(String[] args) {
        String str1="Rinky";
        String str2=new String("Rinky");
        String str3="rinky";
        System.out.println(str1==str2); // == will compare teh refrence-false
        System.out.println(str1==str3); //--false
        System.out.println(str1.equals(str2));//equals function will comp values/content-true
        System.out.println(str1.equalsIgnoreCase(str3));//this function will ignore and print true

    }
}
