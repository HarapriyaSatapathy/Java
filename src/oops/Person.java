package src.oops;

public class Person {


    String ref_name;
    String color;
    int ref_age;
    double height;
    //above all parameters are nothing but the atrributes of a class
    //And below are teh behaviour/methods of  a class

    Person(){
        ref_name="Priya";
        ref_age=40;
        System.out.println("I am the Default Constructor");
    }

    Person(String name,int age){
        this.ref_name=name;
        this.ref_age=age;

    }

//Default constructor will always pass teh default values of parameters when
//its called by another class object
    void walk() {
        System.out.println("Walk!!");
    }

    void eat() {
        System.out.println("eat");
    }
   void PrintDetails(){
       System.out.println("The person name is -->"+this.ref_name);
       System.out.println("The person name is -->"+this.ref_age);
   }

}
