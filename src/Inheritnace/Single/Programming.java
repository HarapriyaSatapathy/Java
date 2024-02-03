package src.Inheritnace.Single;

public class Programming {

    String pname;
    String pAuthor;

    Programming(){
        System.out.println("DC");
    }
    Programming(String name1,String Auth1){
        this.pname=name1;
        this.pAuthor=Auth1;

    }
    void PrintInfo(){
        System.out.println("The Program  is-->"+ " "+ this.pname);
        System.out.println("The program Auth name is-->"+ " "+ this.pAuthor);
    }

    }



