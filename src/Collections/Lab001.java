package src.Collections;

import java.util.ArrayList;
import java.util.List;

public class Lab001 {
    public static void main(String[] args) {
        List mylist=new ArrayList();

        mylist.add("Test1");
        mylist.add("Test2");
        mylist.add(123);
        mylist.add(true);
        mylist.add('c');

        System.out.println(mylist);
        mylist.remove(0);
        mylist.isEmpty();
        mylist.set(0,"sat");
        System.out.println(mylist);

    }
}
