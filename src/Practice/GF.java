package src.Practice;

public class GF {

    String property="3bhk";

    GF(){
        System.out.println("GF DC");
    }


    void singing(){
        System.out.println("Singing");
    }
    GF(String prop){
        this.property=prop;
    }
    void GFPrint(){
        System.out.println("GF Property-->"+this.property);
    }
}
