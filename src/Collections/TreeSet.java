package src.Collections;


import java.util.Set;
//TreeSet stores the elements in 1st letter alphabetical order
public class TreeSet {
    public static void main(String[] args) {

        Set sub=new java.util.TreeSet();
        sub.add("Math");
        sub.add("Sci");
        sub.add("Eng");
        sub.add("Hist");

        System.out.println(sub);
    }
}
