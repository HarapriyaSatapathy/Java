package src.Collections;

import java.util.ArrayList;
import java.util.List;

public class Lab003 {
    public static void main(String[] args) {
        List mylist=new ArrayList<>();

        mylist.add("Test1");
        mylist.add("Test2");
        mylist.add(123);
        mylist.add(true);
        mylist.add('c');

        for (Object obj:mylist){
            System.out.println(obj);
        }

    }
}
