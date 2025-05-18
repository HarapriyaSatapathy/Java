package src.Collections;

import java.util.LinkedHashSet;
import java.util.Set;

//Linked Hashset stores elements in the same order that user input
public class LinkedHashset {
    public static void main(String[] args) {

        Set sub=new LinkedHashSet();
        sub.add("Math");
        sub.add("Sci");
        sub.add("Eng");
        sub.add("Hist");

        System.out.println(sub);
    }
}
