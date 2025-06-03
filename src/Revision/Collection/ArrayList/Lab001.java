package src.Revision.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Lab001 {
    public static void main(String[] args) {

        List mylist=new ArrayList();

        mylist.add("Rinky");
        mylist.add(30);
        mylist.add("Bangalore");

        System.out.println("Details are -->" + mylist);

        mylist.remove(mylist.get(0));
        System.out.println(mylist);

        mylist.add(0,"Priya");
        System.out.println(mylist);

        for(int i=0;i<mylist.size();i++){
            System.out.println(mylist.get(i));
        }

        for(Object o:mylist){
            System.out.println(o);
        }



    }
}
