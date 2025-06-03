package src.Revision.Collection.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab001 {
    public static void main(String[] args) {

        List subject=new ArrayList();
        subject.add("Math");
        subject.add("Eng");
        subject.add("Hist");
        subject.add("MIL");
        subject.add("Sci");

        List Marks=new ArrayList();
        Marks.add(90);
        Marks.add(92);
        Marks.add(89);
        Marks.add(99);
        Marks.add(93);

        subject.addAll(Marks);
        System.out.println(subject);

        Iterator iterator= subject.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
