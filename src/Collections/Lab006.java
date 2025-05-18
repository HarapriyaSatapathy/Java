package src.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab006 {
    public static void main(String[] args) {
        List courselist=new ArrayList();

        courselist.add("Math");
        courselist.add("Sci");
        courselist.add("Hist");
        courselist.add("Eng");

        Iterator iterator=courselist.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
//Iterator traverse in forward direction

    }
}
