package src.Inheritnace.Single;

public class Java extends Programming{ //by using extends ,we have inherited all features of
                                        //the Programming class to the Java class

    String lname;
    String lAuthor;

    Java(){
        System.out.println("DC");
    }
    Java(String name2,String Auth2){
        this.lname=name2;
        this.lAuthor=Auth2;
    }
    void PrintLanInfo(){
        System.out.println("Language Author -->"+ " "+this.lAuthor);
        System.out.println("Language name -->"+ " "+this.lname);
    }
}
