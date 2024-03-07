package src.Practice;

public class Lab019 {

    String name;
    int age;
    boolean ismarried;
    String colour;

    Lab019() {
       //name="Rinky";
//        age=30;
//        ismarried=true;
//        colour="fair";
        System.out.println("I am the Dc called!!");

    }

    Lab019(String name1, int age1, boolean ismarried1, String colour1) {
        this.name = name1;
        this.age = age1;
        this.ismarried = ismarried1;
        this.colour = colour1;

    }

    void Printdetails() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(ismarried);
        System.out.println(colour);
    }

}




