package src.Collections;

import java.util.HashSet;
import java.util.Set;
//Set doesn't store duplicate value, and its doesn't follow
//any sorting order to store elements
public class Lab009 {
    public static void main(String[] args) {
        Set fruits=new HashSet();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Water Melon");
        fruits.add("Orange");
        fruits.add("orange");

        System.out.println(fruits);




    }
}
