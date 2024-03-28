package src.Collections;

import java.util.ArrayList;
import java.util.List;

public class Lab002 {
    public static void main(String[] args) {
        List mylist=new ArrayList();

        mylist.add("Test1");
        mylist.add("Test2");
        mylist.add(123);
        mylist.add(true);
        mylist.add('c');

        for (int i=0;i<mylist.size();i++){
            System.out.println(mylist.get(i));

        }

    }
}
