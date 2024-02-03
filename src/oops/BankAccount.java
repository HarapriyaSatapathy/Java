package src.oops;

public class BankAccount {

    String ref_name;
    int ref_Bal;
    String ref_Bankcode;
    double ref_height;
    String ref_colour;


    BankAccount(){
        ref_name="SBI";
        ref_Bal=0;
        ref_Bankcode="SBIN001";
        System.out.println("DC");

        }
    BankAccount(String bname,int bal,String bcode){
        this.ref_name=bname;
        this.ref_Bal=bal;
        this.ref_Bankcode=bcode;
        System.out.println("PC");

    }
    //we can have multiple parameterized constructor in a class but default constructor will
    //be always 1
    //In case of multiple constructor , its called constructor overloading
    //EX:Here lets craete one more PC

    BankAccount (String colour,double height){
        this.ref_height=height;
        this.ref_colour=colour;
        System.out.println("PC");
    }

    void PrintDetails(){
        System.out.println("----The Banker 1st Entry-----");
        System.out.println("My Bank Name is -->"+ " "+this.ref_name);
        System.out.println("My Bank Bal is -->"+ " "+this.ref_Bal);
        System.out.println("My Bank Code is -->"+ " "+this.ref_Bankcode);
    }
    void OtherDetails(){
        System.out.println("----The Banker 2nd entry------");
        System.out.println("Colur is-->"+ " "+this.ref_colour);
        System.out.println("Height is-->"+ " "+this.ref_height);
    }
    //and here we have 2 methods which are called method overloading
}
