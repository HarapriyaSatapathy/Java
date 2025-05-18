package src.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lab007 {
    public static void main(String[] args) {
        List courselist=new ArrayList();

        courselist.add("Math");
        courselist.add("Sci");
        courselist.add("Hist");
        courselist.add("Eng");

        ListIterator lt= courselist.listIterator(courselist.size());
        while(lt.hasPrevious()){
            System.out.println(lt.previous());
        }

//Only List iterator has option to traverse backward, that's the disadvantage
        //we have to provide the list size to traverse backward
    }
}
