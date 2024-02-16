package src.Collections;

import java.util.List;

public class List1 {
    public static void main(String[] args) {
        List fruits=List.of("apple","orange","bananna");
        List shopping_items=List.of("Bread","Butter","Milk");

        System.out.println(fruits.contains("orange"));
        System.out.println(fruits.get(1));
        System.out.println(shopping_items.size());
       // fruits.add(1,"papaya");--as List is static, so its not possible to add or remove
        //anything .Whatever we have initialized that will be not modified
       // fruits.remove("apple");


    }

}//List is an interface ,so its methods are incomplete, to complete it we need to use a class
//and create object for it. So we will use Arraylist, LinkedList etc