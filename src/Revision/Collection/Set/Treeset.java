package src.Revision.Collection.Set;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        Set treeset=new TreeSet();

        treeset.add("Apple");
        treeset.add("Orange");
        treeset.add("Bananna");
        treeset.add("Grapes");
        System.out.println(treeset);

        //To traverse the elements

        for (Object o:treeset){
            System.out.println(o);
        }
        //traverse by iterator

        Iterator iterator=treeset.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
