package src.Collections;
import java.util.ArrayList;
import java.util.List;


public class ArrayList1 {

    public static void main(String[] args) {
        List student=new ArrayList();
        student.add("Rinky");
        student.add("10th");
        student.add(30);
        student.add("Bangalore");
        System.out.println(student);
        student.set(0,"Richil");
        student.remove(2);
        System.out.println(student);
        System.out.println(student.isEmpty());
        System.out.println(student.size());
    for(int i=0;i<student.size();i++){
        System.out.println(student.get(i));
    }

    }
}
