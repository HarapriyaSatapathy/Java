package src.StaticKeyword;

public class RC {
    public static void main(String[] args) {

        Static s1=new Static();

        System.out.println(Static.Section);//without creation of object also, we can access the
                                           //variable and static method
       Static.Univ();

//        System.out.println(Static.name);can not use the no-static varibale and method
//        Static.Students();without object creation
          System.out.println(s1.name);
           s1.Students();




    }//So only main method in java is always static because it can run without creation of object
}
