package src.Collections;

import java.util.ArrayList;
import java.util.List;

public class Lab005 {
    public static void main(String[] args) {
        List courselist=new ArrayList();

        courselist.add("Math");
        courselist.add("Sci");
        courselist.add("Hist");
        courselist.add("Eng");

        List numlist=new ArrayList();

        numlist.add(99);
        numlist.add(67);
        numlist.add(89);
        numlist.add(67);

        courselist.addAll(numlist);
        System.out.println(courselist);


    }
}
