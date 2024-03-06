package src.Practice;

public class Lab016 {
    public static void main(String[] args) {
        String str1="Rinky";
        String str2=new String("Rinky");
        String str3="Rinky";
        String str4="rinky";

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1==str3);
        System.out.println(str3.equalsIgnoreCase(str4));
        String str5=str1.concat("sat");
        System.out.println(str5);
        System.out.println(str1);


    }
}
