package src.Collections;

import java.util.HashSet;
import java.util.Set;
//Hashset stores elements in random order
public class Hashset {
    public static void main(String[] args) {

        Set sub=new HashSet();
        sub.add("Math");
        sub.add("Sci");
        sub.add("Eng");
        sub.add("Hist");

        System.out.println(sub);
    }
}
