package src.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set doesn't store duplicate value, and its doesn't follow
//any sorting order to store elements
//We can iterate/print them by using for each loop or Iterator
public class Lab010 {
    public static void main(String[] args) {
        Set fruits=new HashSet();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Water Melon");
        fruits.add("Orange");
        fruits.add("orange");

        System.out.println(fruits);

        for (Object o:fruits){
            System.out.println(o);
        }

     Iterator it= fruits.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
