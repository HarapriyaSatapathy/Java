package src.Practice;

public class Parent extends GF{
    String surname="sat";
    String colour="Fair";

    Parent (){
        System.out.println("Parent DC");
    }
     void talking(){
        System.out.println("Fluently");
    }

    Parent(String sname,String clr){
        this.surname=sname;
        this.colour=clr;
    }
    void Printinfo(){
        System.out.println("The surname is-->"+this.surname);
        System.out.println("The colour is-->"+this.colour);
    }
}
