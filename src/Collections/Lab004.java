package src.Collections;

import java.util.ArrayList;
import java.util.List;

public class Lab004 {
    //if you want to restrict to perticular datatype, then use diamond operator
    public static void main(String[] args) {
        List <String> mylist=new ArrayList();

        mylist.add("Test1");
        mylist.add("Test2");
//        mylist.add(123);  So here we have restricted only to String, so other data types are giving error
//        mylist.add(true);
//        mylist.add('c');

        for (int i=0;i<mylist.size();i++){
            System.out.println(mylist.get(i));

        }

    }
}
